<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<style type="text/css">{
	.err{
		color: red;
	}
}
</style>
</head>
<body>
	<fieldset>
		<center>		
			<legend><h1>Registration Page</h1></legend>
			<form action="./processRegistration.htm" method="post">
			<table>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstname" />&nbsp; <form:errors class="err" path="userDetail.firstname"/></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastname" />&nbsp; <form:errors class="err" path="userDetail.lastname"/></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" />&nbsp; <form:errors class="err" path="userDetail.email"/></td>
				</tr>
				<tr>
					<td>Contact</td>
					<td><input type="text" name="contact" />&nbsp; <form:errors class="err" path="userDetail.contact"/></td>
				</tr>
				<tr>
					<td>Date of Birth</td>
					<td><input type="date" name="dob" />&nbsp; <form:errors class="err" path="userDetail.dob"/></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
					
				</tr>
				<tr>
					<td>Gender</td>
					<td>
						<select>
							<option value="Male">Male</option>
							<option value="Female">Female</option>
							<option value="Not Specified">Not Specified</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>Image</td>
					<td><input type="file" id="myFile" />&nbsp; <form:errors class="err" path="userDetail.image"/></td>
				</tr>
				<tr>
					<td>Date of Joining</td>
					<td><input type="date" name="doj" />&nbsp; <form:errors class="err" path="userDetail.doj"/></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align:center"><input type="submit" value="Submit"></td>
				</tr>
			</table>
			</form>
		</center>
	</fieldset>
</body>
</html>