<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modify User Details</title>
</head>
<body>
	<div>
		<h1>Edit Profile</h1>
		<hr>
		<div>
			<h4>Upload a new photo</h4>
			<img src="//placehold.it/100" class="avatar img-circle" alt="avatar">
			<br /> <input type="file">
		</div>
		<div>
			<h3>Personal Info</h3>
			<form>
				<table>
					<tr>
						<td><label>First name:</label></td>
						<td><input type="text" name="firstname"></td>
					</tr>
					<tr>
						<td><label>Last name:</label></td>
						<td><input type="text" name="lastname"></td>
					</tr>
					<tr>
						<td><label>Birth Date</label></td>
						<td><input type="date" name="dob"></td>
					</tr>
					<tr>
						<td><label>Joining Date:</label></td>
						<td><input type="date" name="doj"></td>
					</tr>
					<tr>
						<td><label>Password:</label></td>
						<td><input type="password" name="password"></td>
					</tr>
					<tr>
						<td><label>Confirm password:</label></td>
						<td><input type="password"></td>
					</tr>
					<tr>
						<td><label>Company Location:</label></td>
						<td><select name="company_locations">
								<option value="1">Urbandale-114th Street-50322</option>
								<option value="2">Moline-2009 53rd Street-61265</option>
								<option value="3">Urbandale-114th Street
									JohnDeere-50322</option>
						</select></td>
					</tr>
				</table>
				<h3>Address Info</h3>
				<table>
					<tr>
						<td><label>Contact Number:</label></td>
						<td><input type="text" name="conatct"></td>
					</tr>
					<tr>
						<td><label>Street:</label></td>
						<td><input type="text" name="street"></td>
					</tr>
					<tr>
						<td><label>Country:</label></td>
						<td><select name="countries">
								<option value="1">United States
									of America</option>
								<option value="2">India</option>
						</select></td>
					</tr>
					<tr>
						<td><label>State:</label></td>
						<td><select name="states">
								<option value="1">Iowa</option>
								<option value="2">Illinois</option>
						</select></td>
					</tr>
					<tr>
						<td><label>City:</label></td>
						<td><select name="cities">
								<option value="1">Urbandale</option>
								<option value="2">Moline</option>
						</select></td>
					</tr>
					<tr>
						<td><label>Zipcode:</label></td>
						<td><input type="text" name="zipcode"></td>
					</tr>
					<tr>
						<td><input type="button" value="Save Changes"></td>
						<td><input type="reset" value="Cancel"></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>