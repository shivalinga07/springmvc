<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="updateemployee"  modelAttribute="employee">
		<form:label path="id">Id</form:label>
		<form:input path="id" readonly="true" />
		<form:label path="name">Name:</form:label>
		<form:input path="name" />
		<form:label path="address">Address:</form:label>
		<form:input path="address" />
		<form:label path="age">Age:</form:label>
		<form:input path="age" readonly="true"/>
		<form:label path="email">Email:</form:label>
		<form:input path="email" />
		<form:label path="dob">DOB:</form:label>
		<form:input path="dob" />
		<form:label path="salary">Salary:</form:label>
		<form:input path="salary" />
		<form:label path="status">Status:</form:label>
		<form:input path="status" />
		<input type="submit">
	</form:form>
</body>
</html>