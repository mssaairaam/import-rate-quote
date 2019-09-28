<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Import Quote</title>
<link rel="stylesheet" type="text/css" href="css/lib/jquery-ui.css" />
<link rel="stylesheet" type="text/css" href="css/lib/bootstrap.min.css" />

<script type="text/javascript" src="js/lib/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="js/lib/jquery-ui.js"></script>
<script type="text/javascript" src="js/lib/bootstrap.min.js"></script>
<script type="text/javascript" src="js/app/import-quote.js"></script>
<script type="text/javascript" src="js/app/util.js"></script>
</head>
<body>
	<div id="import-quote-div" align="center">
		<table style="width: 72%; font-family: Calibri; font-size: 17px;"
				border = "1">
			<tr style="height: 20px;"></tr>
			
			<!-- Header -->
			<tr>
				<td>
					<table style="width: 100%">
						<tr height="80px" 
							class="table table-striped" 
							style="background-color: #337ab7; 
								color: #fff; 
								font-size: 20px;">
							<td align="center" style="width: 10%">
									Logo
							</td>
							<td style="width: 50%">
							</td>
							<td align="center">
									Topic 1
							</td>
							<td align="center">
									Topic 2
							</td>
							<td align="center">
									Topic 3
							</td>
							<td align="center">
									Topic 4
							</td>
						</tr>
					</table>
				</td>
			</tr>
			
			<tr style="height: 23px;"></tr>
			
			<!-- Body -->
			<tr>
				<td align="center">
					<table id="import-quote-body" 
						style="width: 70%;">
						<tr style="height: 23px;"></tr>
						<tr style="font-size: 30px">
							<td>
								<b> Import Quote </b>
							</td>
						</tr>
						<tr style="height: 23px;"></tr>
						<tr align="center" 
							style="font-size: 20px">
							<td>
								Enter Shipment Details
							</td>
						</tr>
						<tr style="height: 23px;"></tr>
						<tr align="center" >
							<td align="center" >
								<table style="width: 50%">
									<tr>
										<td style="text-align: left;">
											<label for="import-quote-weight">Weight (Kg)</label>
										</td>
										<td style="width: 5%"> : 
										</td>
										<td>
											<input type="text" id="import-quote-weight"
											placeholder="Weight (in Kg)" 
											required="required" 
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr style="height: 18px;"></tr>
									<tr>
										<td style="text-align: left;">
											<label for="import-quote-volume">Volume (m3)</label>
										</td>
										<td style="width: 5%"> : 
										</td>
										<td>
											<input type="text" id="import-quote-volume"
											placeholder="Volume (in m3)" 
											required="required" 
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr style="height: 18px;"></tr>
									<tr>
										<td style="text-align: left;">
											<label for="import-quote-volume">Destination Airport</label>
										</td>
										<td style="width: 5%"> : 
										</td>
										<td>
											<select id="import-quote-destination-airport">
											  <option value="SYD">SYD</option>
											  <option value="MEL">MEL</option>
											  <option value="BNE">BNE</option>
											</select>
										</td>
									</tr>
									<tr style="height: 30px;"></tr>
									<tr>
										<td colspan="3" style="text-align: center;">
											<input
											type="button" value="Submit" id="import-quote-submit" class="btn btn-primary"
											style="height: 35px; width: 120px; font-size: 18px; font-family: Calibri;"
											onclick="calculateQuote()">
										</td>
									</tr>
									<tr style="height: 35px;"></tr>
								</table>
							</td>
						</tr>
						<tr align="center" >
							<td>
								<p id="import-quote-calculated-quote-value">
								</p>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>