<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="2px">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Address</th>
			<th>Age</th>
			<th>Email</th>
			<th>DOB</th>
			<th>Salary</th>
			<th>Status</th>
			<th>Delete</th>
			<th>Edit</th>
		</tr>
		<c:forEach items="${emp}" var="employee">
			<tr>
				<td>${employee.getId()}</td>
				<td>${employee.getName()}</td>
				<td>${employee.getAddress()}</td>
				<td>${employee.getAge()}</td>
				<td>${employee.getEmail()}</td>
				<td>${employee.getDob()}</td>
				<td>${employee.getSalary()}</td>
				<td>${employee.getStatus()}</td>
				<td><a href="delete?id=${employee.id}">delete</a></td>
				<td><a href="edit?id=${employee.id}">edit</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>


