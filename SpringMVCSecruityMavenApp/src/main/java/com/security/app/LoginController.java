package com.security.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value = { "/"}, method = RequestMethod.GET)
	public ModelAndView welcomePage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("welcomePage");
		return model;
	}

	@RequestMapping(value = { "/homePage"}, method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("homePage");
		return model;
	}
	
	@RequestMapping(value = "/loginPage", method = RequestMethod.GET)
	public ModelAndView loginPage(@RequestParam(value = "error",required = false) String error,
	@RequestParam(value = "logout",	required = false) String logout) {
		
		// 데이터와 뷰를 동시에 설정이 가능
		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid Credentials provided.");  // 뷰로 보낼 데이터 값
		}

		if (logout != null) {
			model.addObject("message", "Logged out from my page successfully.");
		}

		model.setViewName("loginPage");
		return model;
	}
	
}
