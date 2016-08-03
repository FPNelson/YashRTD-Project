<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Location</title>
</head>
<body>
	<fieldset class="formborder" style="width: 350px">
		<legend>New Location</legend>
		<form action="processLocation.htm" method="POST">
			<table>
				<tr>
					<td><label>Country</label></td>
					<td><select name="country">
							<option value="United States of America">United States
								of America</option>
							<option value="India">India</option>
					</select></td>
				</tr>
				<tr>
					<td><label>State</label></td>
					<td><select name="state">
							<option value="Iowa">Iowa</option>
							<option value="Illinois">Illinois</option>
							<option value="Mumbai">Mumbai</option>
					</select></td>
				</tr>
				<tr>
					<td><label>City</label></td>
					<td><select name="city">
							<option value="Urbandale">Urbandale</option>
							<option value="Moline">Moline</option>
					</select>
					<td>
				</tr>
				<tr>
					<td><label>Location</label></td>
					<td><input type="text" name="location_name"/></td>
				</tr>
				<tr>
					<td><label>Zipcode</label></td>
					<td><input type="text" name="location_zipcode"/></td>
				</tr>
				<tr>
					<td><input type="submit" value="Add" /></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>