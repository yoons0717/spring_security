

<html>

<h1>Welcome! <sec:authentication property="principal.username" /> This is
			Login Success Page :)</h1>





<sec:authorize access="isAuthenticated()"> <%-- JSP 화면 항목에 대한 인가 --%>
  <a href="#" onclick="document.getElementById('logout').submit();">로그아웃</a>
</sec:authorize>


<form  id="logout" action="<c:url value='/logout'/>" method="POST">
  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form>
</html>