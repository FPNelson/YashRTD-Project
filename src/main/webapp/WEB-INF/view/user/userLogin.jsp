<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<fieldset>
	<legend>User Login</legend>
	<form action="./processLogin.htm" method="post">
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="email"/></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"/></td>
			</tr>
			<tr>
				
				<td colspan="2"><a href="./userRegistration.htm">Register</a><input type="submit" value="Login"/></td>
			</tr>
		</table>
	</form>
</fieldset>

</body>
</html>