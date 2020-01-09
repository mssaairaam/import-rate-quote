<!doctype html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Import Quote Configuration</title>
<link rel="stylesheet" type="text/css" href="css/lib/jquery-ui.css" />
<link rel="stylesheet" type="text/css" href="css/lib/bootstrap.min.css" />

<script type="text/javascript" src="js/lib/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="js/lib/popper.min.js"></script>
<script type="text/javascript" src="js/lib/bootstrap.min.js"></script>
<script type="text/javascript" src="js/app/import-quote-configuration.js"></script>
<script type="text/javascript" src="js/app/util.js"></script>
</head>
<body>
	<div id="import-quote-div" align="center">
		<table style="width: 72%; font-family: Calibri; font-size: 17px;"
			border="1">
			<tr style="height: 20px;"></tr>

			<!-- Header -->
			<tr>
				<td>
					<table style="width: 100%">
						<tr height="80px" class="table table-striped"
							style="background-color: #337ab7; color: #fff; font-size: 20px;">
							<td align="center" style="width: 10%">Logo</td>
							<td style="width: 80%"></td>
							<td align="right">Logout</td>
						</tr>
					</table>
				</td>
			</tr>

			<tr style="height: 23px;"></tr>

			<!-- Body -->
			<tr>
				<td align="center">
					<table id="import-quote-body" style="width: 85%; font-size: 15px;">
						<tr style="height: 23px;"></tr>
						<tr style="font-size: 30px">
							<td><b> Import Quote Configuration</b></td>
						</tr>
						<tr style="height: 23px;"></tr>
						<tr align="center">
							<td align="center">
								<table style="width: 85%; font-size: larger;">
									<tr>
										<td style="text-align: center; width: 25%">
											<label style="text-decoration: underline;"></label>
										</td>
										<td style="text-align: center; width: 4%"></td>
										<td style="text-align: center; width: 15%">
											<label style="text-decoration: underline;"><b>Existing Value ($)</b></label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%">
											<label style="text-decoration: underline;"><b>New Value ($)</b></label>
										</td>
									</tr>
									<tr style="height: 18px;"></tr>
									<tr>
										<td style="text-align: left; width: 25%">
											<label><b>Exchange Rate</b></label>
										</td>
										<td style="text-align: center; width: 4%"> => </td>
										<td style="text-align: center; width: 15%; font-size: x-large;">
											<label style="color: #6c757d; font-family: monospace;" id="config-exchangeRate-label">
												${existingQuoteVariables.exchangeRate}
											</label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%; font-size: x-large;">
											<input type="text" style="font-family: monospace;  text-align: center"  id="config-exchangeRate" size="10" 
											value="${existingQuoteVariables.exchangeRate}"
											
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr style="height: 25px;"></tr>
									<tr>
										<td colspan="5" style="text-align: left;">
											<b>Import Charges</b>
										</td>
									</tr>
									<tr style="height: 8px;"></tr>
									<tr>
										<td style="text-align: left; width: 25%">
											<label>Airline Import Terminal Fee Per Kg</label>
										</td>
										<td style="text-align: center; width: 4%"> => </td>
										<td style="text-align: center; width: 15%; font-size: x-large;">
											<label style="color: #6c757d; font-family: monospace;" id="config-airlineImportTerminalFeePerKg-label">
												${existingQuoteVariables.airlineImportTerminalFeePerKg}
											</label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%; font-size: x-large;">
											<input type="text" style="font-family: monospace;  text-align: center"  id="config-airlineImportTerminalFeePerKg" size="10" 
											value="${existingQuoteVariables.airlineImportTerminalFeePerKg}"
											
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr>
										<td style="text-align: left; width: 25%">
											<label>Airline Import Terminal Fee Minimum</label>
										</td>
										<td style="text-align: center; width: 4%"> => </td>
										<td style="text-align: center; width: 15%; font-size: x-large;">
											<label style="color: #6c757d; font-family: monospace;" id="config-airlineImportTerminalFeeMininum-label">
												${existingQuoteVariables.airlineImportTerminalFeeMininum}
											</label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%; font-size: x-large;">
											<input type="text" style="font-family: monospace;  text-align: center"  id="config-airlineImportTerminalFeeMininum" size="10" 
											value="${existingQuoteVariables.airlineImportTerminalFeeMininum}"
											
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr style="height: 25px;"></tr>
									<tr>
										<td style="text-align: left; width: 25%">
											<label>Air Cargo Break-bulk Fee Per Kg</label>
										</td>
										<td style="text-align: center; width: 4%"> => </td>
										<td style="text-align: center; width: 15%; font-size: x-large;">
											<label style="color: #6c757d; font-family: monospace;" id="config-aircargoBreakBulkFeePerKg-label">
												${existingQuoteVariables.aircargoBreakBulkFeePerKg}
											</label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%; font-size: x-large;">
											<input type="text" style="font-family: monospace;  text-align: center"  id="config-aircargoBreakBulkFeePerKg" size="10" 
											value="${existingQuoteVariables.aircargoBreakBulkFeePerKg}"
											
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr>
										<td style="text-align: left; width: 25%">
											<label>Air Cargo Break-bulk Fee Minimum</label>
										</td>
										<td style="text-align: center; width: 4%"> => </td>
										<td style="text-align: center; width: 15%; font-size: x-large;">
											<label style="color: #6c757d; font-family: monospace;" id="config-aircargoBreakBulkFeeMinimum-label">
												${existingQuoteVariables.aircargoBreakBulkFeeMinimum}
											</label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%; font-size: x-large;">
											<input type="text" style="font-family: monospace;  text-align: center"  id="config-aircargoBreakBulkFeeMinimum" size="10"   
											value="${existingQuoteVariables.aircargoBreakBulkFeeMinimum}"
											
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr style="height: 25px;"></tr>
									<tr>
										<td style="text-align: left; width: 25%">
											<label>Airport Transfer Fee Per Kg</label>
										</td>
										<td style="text-align: center; width: 4%"> => </td>
										<td style="text-align: center; width: 15%; font-size: x-large;">
											<label style="color: #6c757d; font-family: monospace;" id="config-airportTransferFeePerKg-label">
												${existingQuoteVariables.airportTransferFeePerKg}
											</label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%; font-size: x-large;">
											<input type="text" style="font-family: monospace;  text-align: center"  id="config-airportTransferFeePerKg" size="10"   
											value="${existingQuoteVariables.airportTransferFeePerKg}"
											
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr>
										<td style="text-align: left; width: 25%">
											<label>Airport Transfer Fee Minimum</label>
										</td>
										<td style="text-align: center; width: 4%"> => </td>
										<td style="text-align: center; width: 15%; font-size: x-large;">
											<label style="color: #6c757d; font-family: monospace;" id="config-airportTransferFeeMinimum-label">
												${existingQuoteVariables.airportTransferFeeMinimum}
											</label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%; font-size: x-large;">
											<input type="text" style="font-family: monospace;  text-align: center"  id="config-airportTransferFeeMinimum" size="10"   
											value="${existingQuoteVariables.airportTransferFeeMinimum}"
											
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr style="height: 25px;"></tr>
									<tr>
										<td style="text-align: left; width: 25%">
											<label>Airline Document Handling Fee Per HAWB</label>
										</td>
										<td style="text-align: center; width: 4%"> => </td>
										<td style="text-align: center; width: 15%; font-size: x-large;">
											<label style="color: #6c757d; font-family: monospace;" id="config-airlineDocumentHandlingFeePerHawb-label">
												${existingQuoteVariables.airlineDocumentHandlingFeePerHawb}
											</label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%; font-size: x-large;">
											<input type="text" style="font-family: monospace;  text-align: center"  id="config-airlineDocumentHandlingFeePerHawb" size="10"  
											value="${existingQuoteVariables.airlineDocumentHandlingFeePerHawb}"
											
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr style="height: 25px;"></tr>
									<tr>
										<td style="text-align: left; width: 25%">
											<label>Cargo Automation Fee Per Supplier</label>
										</td>
										<td style="text-align: center; width: 4%"> => </td>
										<td style="text-align: center; width: 15%; font-size: x-large;">
											<label style="color: #6c757d; font-family: monospace;" id="config-cargoAutomationFeePerSupplier-label">
												${existingQuoteVariables.cargoAutomationFeePerSupplier}
											</label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%; font-size: x-large;">
											<input type="text" style="font-family: monospace;  text-align: center"  id="config-cargoAutomationFeePerSupplier" size="10" 
											value="${existingQuoteVariables.cargoAutomationFeePerSupplier}"
											
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr style="height: 25px;"></tr>
									<tr>
										<td style="text-align: left; width: 25%">
											<label>Delivery Order Fee Per HAWB</label>
										</td>
										<td style="text-align: center; width: 4%"> => </td>
										<td style="text-align: center; width: 15%; font-size: x-large;">
											<label style="color: #6c757d; font-family: monospace;" id="config-deliveryOrderFeePerHawb-label">
												${existingQuoteVariables.deliveryOrderFeePerHawb}
											</label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%; font-size: x-large;">
											<input type="text" style="font-family: monospace;  text-align: center"  id="config-deliveryOrderFeePerHawb" size="10" 
											value="${existingQuoteVariables.deliveryOrderFeePerHawb}"
											
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr style="height: 25px;"></tr>
									<tr>
										<td colspan="5" style="text-align: left;">
											<b>Customs Clearance and Delivery</b>
										</td>
									</tr>
									<tr style="height: 8px;"></tr>
									<tr>
										<td style="text-align: left; width: 25%">
											<label>Customs Clearance Per HAWB</label>
										</td>
										<td style="text-align: center; width: 4%"> => </td>
										<td style="text-align: center; width: 15%; font-size: x-large;">
											<label style="color: #6c757d; font-family: monospace;" id="config-customsClearanceFeePerHawb-label">
												${existingQuoteVariables.customsClearanceFeePerHawb}
											</label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%; font-size: x-large;">
											<input type="text" style="font-family: monospace;  text-align: center"  id="config-customsClearanceFeePerHawb" size="10" 
											value="${existingQuoteVariables.customsClearanceFeePerHawb}"
											
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr style="height: 25px;"></tr>
									<tr>
										<td style="text-align: left; width: 25%">
											<label>Cost Per Additional Entry Line</label>
										</td>
										<td style="text-align: center; width: 4%"> => </td>
										<td style="text-align: center; width: 15%; font-size: x-large;">
											<label style="color: #6c757d; font-family: monospace;" id="config-costPerAdditionalEntryLine-label">
												${existingQuoteVariables.costPerAdditionalEntryLine}
											</label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%; font-size: x-large;">
											<input type="text" style="font-family: monospace;  text-align: center"  id="config-costPerAdditionalEntryLine" size="10" 
											value="${existingQuoteVariables.costPerAdditionalEntryLine}"
											
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr style="height: 25px;"></tr>
									<tr>
										<td style="text-align: left; width: 25%">
											<label>Customs Cargo Reporting Fee Per HAWB</label>
										</td>
										<td style="text-align: center; width: 4%"> => </td>
										<td style="text-align: center; width: 15%; font-size: x-large;">
											<label style="color: #6c757d; font-family: monospace;" id="config-customsCargoReportingFeePerHawb-label">
												${existingQuoteVariables.customsCargoReportingFeePerHawb}
											</label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%; font-size: x-large;">
											<input type="text" style="font-family: monospace;  text-align: center"  id="config-customsCargoReportingFeePerHawb" size="10" 
											value="${existingQuoteVariables.customsCargoReportingFeePerHawb}"
											
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr style="height: 25px;"></tr>
									<tr>
										<td style="text-align: left; width: 25%">
											<label>Delivery Cartage (Metropolitan Area) - Per Kg</label>
										</td>
										<td style="text-align: center; width: 4%"> => </td>
										<td style="text-align: center; width: 15%; font-size: x-large;">
											<label style="color: #6c757d; font-family: monospace;" id="config-deliveryCartageFeePerKg-label">
												${existingQuoteVariables.deliveryCartageFeePerKg}
											</label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%; font-size: x-large;">
											<input type="text" style="font-family: monospace;  text-align: center"  id="config-deliveryCartageFeePerKg" size="10" 
											value="${existingQuoteVariables.deliveryCartageFeePerKg}"
											
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr>
										<td style="text-align: left; width: 25%">
											<label>Delivery Cartage (Metropolitan Area) - Minimum</label>
										</td>
										<td style="text-align: center; width: 4%"> => </td>
										<td style="text-align: center; width: 15%; font-size: x-large;">
											<label style="color: #6c757d; font-family: monospace;" id="config-deliveryCartageFeeMinimum-label">
												${existingQuoteVariables.deliveryCartageFeeMinimum}
											</label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%; font-size: x-large;">
											<input type="text" style="font-family: monospace;  text-align: center"  id="config-deliveryCartageFeeMinimum" size="10" 
											value="${existingQuoteVariables.deliveryCartageFeeMinimum}"
											
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr>
										<td style="text-align: left; width: 25%">
											<label>Delivery Cartage (Metropolitan Area) - Basic</label>
										</td>
										<td style="text-align: center; width: 4%"> => </td>
										<td style="text-align: center; width: 15%; font-size: x-large;">
											<label style="color: #6c757d; font-family: monospace;" id="config-deliveryCartageFeeBasic-label">
												${existingQuoteVariables.deliveryCartageFeeBasic}
											</label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%; font-size: x-large;">
											<input type="text" style="font-family: monospace;  text-align: center"  id="config-deliveryCartageFeeBasic" size="10" 
											value="${existingQuoteVariables.deliveryCartageFeeBasic}"
											
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr style="height: 25px;"></tr>
									<tr>
										<td style="text-align: left; width: 25%">
											<label>Delivery Cartage Fuel Surcharge</label>
										</td>
										<td style="text-align: center; width: 4%"> => </td>
										<td style="text-align: center; width: 15%; font-size: x-large;">
											<label style="color: #6c757d; font-family: monospace;" id="config-deliveryCartageFeeFuelSurcharge-label">
												${existingQuoteVariables.deliveryCartageFeeFuelSurcharge}
											</label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%; font-size: x-large;">
											<input type="text" style="font-family: monospace;  text-align: center"  id="config-deliveryCartageFeeFuelSurcharge" size="10" 
											value="${existingQuoteVariables.deliveryCartageFeeFuelSurcharge}"
											
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr style="height: 25px;"></tr>
									<tr>
										<td style="text-align: left; width: 25%">
											<label>Toll Fee Per Trip</label>
										</td>
										<td style="text-align: center; width: 4%"> => </td>
										<td style="text-align: center; width: 15%; font-size: x-large;">
											<label style="color: #6c757d; font-family: monospace;" id="config-tollFeePerTrip-label">
												${existingQuoteVariables.tollFeePerTrip}
											</label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%; font-size: x-large;">
											<input type="text" style="font-family: monospace;  text-align: center"  id="config-tollFeePerTrip" size="10" 
											value="${existingQuoteVariables.tollFeePerTrip}"
											
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr style="height: 25px;"></tr>
									<tr>
										<td colspan="5" style="text-align: left;">
											<b>Insurance</b>
										</td>
									</tr>
									<tr style="height: 25px;"></tr>
									<tr>
										<td style="text-align: left; width: 25%">
											<label>Insured Amount</label>
										</td>
										<td style="text-align: center; width: 4%"> => </td>
										<td style="text-align: center; width: 15%; font-size: x-large;">
											<label style="color: #6c757d; font-family: monospace;" id="config-insurancePremiumFee-label">
												${existingQuoteVariables.insurancePremiumFee}
											</label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%; font-size: x-large;">
											<input type="text" style="font-family: monospace;  text-align: center"  id="config-insurancePremiumFee" size="10" 
											value="${existingQuoteVariables.insurancePremiumFee}"
											
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr>
										<td style="text-align: left; width: 25%">
											<label>Insured Premium Percentage</label>
										</td>
										<td style="text-align: center; width: 4%"> => </td>
										<td style="text-align: center; width: 15%; font-size: x-large;">
											<label style="color: #6c757d; font-family: monospace;" id="config-insurancePremiumPercentage-label">
												${existingQuoteVariables.insurancePremiumPercentage}
											</label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%; font-size: x-large;">
											<input type="text" style="font-family: monospace;  text-align: center"  id="config-insurancePremiumPercentage" size="10" 
											value="${existingQuoteVariables.insurancePremiumPercentage}"
											
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr>
										<td style="text-align: left; width: 25%">
											<label>Insured Premium Fee Minimum</label>
										</td>
										<td style="text-align: center; width: 4%"> => </td>
										<td style="text-align: center; width: 15%; font-size: x-large;">
											<label style="color: #6c757d; font-family: monospace;" id="config-insurancePremiumFeeMinimum-label">
												${existingQuoteVariables.insurancePremiumFeeMinimum}
											</label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%; font-size: x-large;">
											<input type="text" style="font-family: monospace;  text-align: center"  id="config-insurancePremiumFeeMinimum" size="10" 
											value="${existingQuoteVariables.insurancePremiumFeeMinimum}"
											
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr>
										<td style="text-align: left; width: 25%">
											<label>Insured Preparation Fee Per Certificate</label>
										</td>
										<td style="text-align: center; width: 4%"> => </td>
										<td style="text-align: center; width: 15%; font-size: x-large;">
											<label style="color: #6c757d; font-family: monospace;" id="config-insurancePreparationFeePreCertificate-label">
												${existingQuoteVariables.insurancePreparationFeePreCertificate}
											</label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%; font-size: x-large;">
											<input type="text" style="font-family: monospace;  text-align: center"  id="config-insurancePreparationFeePreCertificate" size="10" 
											value="${existingQuoteVariables.insurancePreparationFeePreCertificate}"
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr>
										<td style="text-align: left; width: 25%">
											<label>Insured Preparation Basic Fee</label>
										</td>
										<td style="text-align: center; width: 4%"> => </td>
										<td style="text-align: center; width: 15%; font-size: x-large;">
											<label style="color: #6c757d; font-family: monospace;" id="config-insurancePreparationFeeBasic-label">
												${existingQuoteVariables.insurancePreparationFeeBasic}
											</label>
										</td>
										<td style="text-align: center; width: 4%">|</td>
										<td style="text-align: left; width: 15%; font-size: x-large;">
											<input type="text" style="font-family: monospace;  text-align: center"  id="config-insurancePreparationFeeBasic" size="10" 
											value="${existingQuoteVariables.insurancePreparationFeeBasic}"
											onkeypress="return validateInputValue(this, event);">
										</td>
									</tr>
									<tr style="height: 30px;"></tr>
									<tr>
										<td colspan="5" style="text-align: center;"><input
											type="button" value="Update" id="import-quote-configure-update"
											class="btn btn-success"
											style="height: 35px; width: 120px; font-size: 18px; font-family: Calibri;"
											onclick="configureQuote()"></td>
									</tr>
									<tr style="height: 35px;"></tr>
								</table>
							</td>
						</tr>
						<tr align="center">
							<td>
								<p id="import-quote-configuration-update-message" style="font-style: italic;"></p>
							</td>
						</tr>
						<tr style="height: 50px;"></tr>
					</table>
				</td>
			</tr>
			<tr style="height: 100px;"></tr>
		</table>
	</div>
</body>
</html>