<div class="container" style="margin-top: 40px">
		<div class="row">
			<div class="col-sm-8 col-md-6 col-md-offset-3">
				<div class="panel panel-default">
					<div class="panel-heading">
						<strong> Add Company Location </strong>
					</div>
					<div class="panel-body">
						<form role="form" action="processLocation.htm" method="POST">
							<fieldset>	
								<div class="row">
									<div class="col-sm-8 col-md-10  col-md-offset-1 ">
										<div class="form-group" id="locationinformation">
											<div class="input-group">
												<span class="input-group-addon"> <i
													class="glyphicon glyphicon-user"></i>
												</span>
												<select name="country" class="form-control" aria-labelledby="dropdownMenu1" data-style="btn-primary">
													<option value="" selected disabled>Choose Country</option>
													<option value="United States of America">United States of America</option>
													<option value="India">India</option>
												</select>
												<select name="state" class="form-control" aria-labelledby="dropdownMenu1" data-style="btn-primary">
													<option value="Iowa">Iowa</option>
													<option value="Illinois">Illinois</option>
													<option value="Mumbai">Mumbai</option>
												</select>
												<select name="city" class="form-control" aria-labelledby="dropdownMenu1" data-style="btn-primary">
													<option value="Urbandale">Urbandale</option>
													<option value="Moline">Moline</option>
												</select>
												<input class="form-control" placeholder="Enter Location" name="location_name" type="text" autofocus>
												<input class="form-control" placeholder="Enter Zipcode" name="location_zipcode" type="text" autofocus>
											</div>
										</div>
										<div class="form-group">
											<input type="submit" class="btn btn-lg btn-primary btn-block" value="Add Location">
										</div>

									</div>
								</div>
							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>


<!-- <fieldset class="formborder" style="width: 350px">
	<legend>New Location</legend>
	<form action="processLocation.htm" method="POST">
		<table>
			<tr>
				<td><label>Country</label></td>
				<td><select name="country">
						<option value="United States of America">United States of
							America</option>
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
				<td><input type="text" name="location_name" /></td>
			</tr>
			<tr>
				<td><label>Zipcode</label></td>
				<td><input type="text" name="location_zipcode" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add" /></td>
			</tr>
		</table>
	</form>
</fieldset>
 -->





