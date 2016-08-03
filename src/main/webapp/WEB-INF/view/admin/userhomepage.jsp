<div class="container" style="margin-top: 40px">
		<div class="row">
			<div class="col-sm-8 col-md-6 col-md-offset-3">
				<div class="panel panel-default">
					<div class="panel-heading">
						<strong> Select Location </strong>
					</div>
					<div class="panel-body">
						<form role="form" action="admin/listusers.do" method="POST">
							<fieldset>	
								<div class="row">
									<div class="col-sm-8 col-md-10  col-md-offset-1 ">
										<div class="form-group" id="userinformation">
											<div class="input-group">
												<span class="input-group-addon"> <i
													class="glyphicon glyphicon-map-marker"></i>
												</span> 
												<select name="companyLocations.location_name" class="form-control" aria-labelledby="dropdownMenu1" data-style="btn-primary">
													<option value="" selected disabled>Choose Company Location</option>
													<option value="USA-URBANDALE-114TH Street">USA-URBANDALE-114TH Street</option>
													<option value="INDIA-INDORE-Bansi Trade Center">INDIA-INDORE-BANSAI TRADE CENTER</option>
													<option value="INDIA-INDORE-Crystal IT PARK">INDIA-INDORE-CRYSTAL IT PARK</option>
													<option value="INDIA-HYDERABAD-IT Park">INDIA-HYDERABAD-IT PARK</option>
													<option value="INDIA-HYDERABAD-My Home Hub">INDIA-HYDERABAD-MY HOME HUB</option>
													<option value="INDIA-HYDERABAD-Raheja Mind Space">INDIA-HYDERABAD-RAHEJA MIND SPACE</option>
												</select>
											</div>
										</div>
										<div class="form-group">
											<input type="submit" class="btn btn-lg btn-primary btn-block" value="View Users">
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