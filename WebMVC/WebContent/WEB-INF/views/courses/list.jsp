<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="header_courses" /></title>
</head>
<body>
	<h1><spring:message code="header_courses" /></h1>
	<s:authorize access="isAuthenticated()">
		<div id="userinfo">
			Привет, <s:authentication property="principal.username" />!
			<br/>
			<a href="../j_spring_security_logout">Выход</a>
		</div>	
	</s:authorize>
	<s:authorize access="isAnonymous()">
		<form id="login" name="loginForm" action="../j_spring_security_check" 
			method="POST">
			<label>Логин: </label>&nbsp;
			<input type="text" name="j_username">
			<label>Пароль: </label>&nbsp;
			<input type="password" name="j_password">
			<input type="submit" name="submit" value="Войти">
			<a href="../security/registration">Регистрация...</a>
		</form>	
	</s:authorize>
	<c:if test="${not empty courses}">
		<table border="1">
			<tr>
				<td>Название</td>
				<td>Часы</td>
				<td>Описание</td>
				<s:authorize access="hasRole('ROLE_USER')">
					<td></td>
					<td></td>
				</s:authorize>
			</tr>
			<c:forEach items="${courses}" var="course">
				<tr>
					<td>${course.title}</td>
					<td>${course.length}</td>
					<td>${course.description}</td>
					
					<s:authorize access="hasRole('ROLE_USER')">
						<td><a href="update/${course.id}">Изменить</a></td>
						<td><a href="delete/${course.id}">Удалить</a></td>
					</s:authorize>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	<s:authorize access="hasRole('ROLE_USER')">
		<a href="update/0">Добавить...</a>
	</s:authorize>
</body>
</html>