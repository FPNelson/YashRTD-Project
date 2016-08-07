<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset class="formborder" style="width: 600px">
		<center><legend>User Details</legend></center>
		<hr>
		<table>
		<tr>
			<th>EmpID</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Contact</th>
			<th>DOB</th>			
		</tr>
		<c:forEach items="${UserDetail}" var="details">
			<tr>
				<td>${details.id}</td>
				<td>${details.firstname}</td>
				<td>${details.lastname}</td>
				<td>${details.email}</td>
				<td>${details.contact}</td>
				<td>${details.dob}</td>
			</tr>
		</c:forEach>
		</table>
</body>
</html>