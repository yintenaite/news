<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${users}" var="user">
		${user.userName}
	</c:forEach>
	<br>
	<form:form action="user" method="post" modelAttribute="user">
		<form:input path="userId"/>
		<form:input path="userName"/>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>