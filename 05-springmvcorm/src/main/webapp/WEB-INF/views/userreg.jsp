<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"
	import="com.springapps.springmvcorm.entity.User, java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>

	<h1>User Registration</h1>
	<form action="registeruser" method="post">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td><input type="submit" Value="Register" /></td>
			</tr>
		</table>
	</form>
	<p>${result}</p>
	<!--  scriplets -->
	<%
	//	 List<User> users = (List<User>) request.getAttribute("users");
	//	 //	if (users != null){
	//		for (User user : users) {
	//			out.println(user);
	//			out.println("<br />");
	//		}
	//	}
	//
	%>

<!-- Using tagLibs(JSTL) instead of scriplets  -->
	<ul>
		<c:forEach items="${users}" var="user">
			<li>${user.id}|$ {user.name} | ${user.email}</li>
		</c:forEach>
	</ul>

</body>
</html>