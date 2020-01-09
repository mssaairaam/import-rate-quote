/**
 * Import Quote Details Processing.
 */
function configureQuote() {
	// empty result section
	$('#import-quote-configuration-update-message').html("");
	
	// get all values and form request body
	var requestData = {
		"exchangeRate" : $("#config-exchangeRate").val(),
		"airlineImportTerminalFeePerKg" : $("#config-airlineImportTerminalFeePerKg").val(),
		"airlineImportTerminalFeeMininum" : $("#config-airlineImportTerminalFeeMininum").val(),
		"aircargoBreakBulkFeePerKg" : $("#config-aircargoBreakBulkFeePerKg").val(),
		"aircargoBreakBulkFeeMinimum" : $("#config-aircargoBreakBulkFeeMinimum").val(),
		"airportTransferFeePerKg" : $("#config-airportTransferFeePerKg").val(),
		"airportTransferFeeMinimum" : $("#config-airportTransferFeeMinimum").val(),
		"airlineDocumentHandlingFeePerHawb" : $("#config-airlineDocumentHandlingFeePerHawb").val(),
		"cargoAutomationFeePerSupplier" : $("#config-cargoAutomationFeePerSupplier").val(),
		"deliveryOrderFeePerHawb" : $("#config-deliveryOrderFeePerHawb").val(),
		"customsClearanceFeePerHawb" : $("#config-customsClearanceFeePerHawb").val(),
		"costPerAdditionalEntryLine" : $("#config-costPerAdditionalEntryLine").val(),
		"customsCargoReportingFeePerHawb" : $("#config-customsCargoReportingFeePerHawb").val(),
		"deliveryCartageFeePerKg" : $("#config-deliveryCartageFeePerKg").val(),
		"deliveryCartageFeeMinimum" : $("#config-deliveryCartageFeeMinimum").val(),
		"deliveryCartageFeeBasic" : $("#config-deliveryCartageFeeBasic").val(),
		"deliveryCartageFeeFuelSurcharge" : $("#config-deliveryCartageFeeFuelSurcharge").val(),
		"tollFeePerTrip" : $("#config-tollFeePerTrip").val(),
		"insurancePremiumFee" : $("#config-insurancePremiumFee").val(),
		"insurancePremiumPercentage" : $("#config-insurancePremiumPercentage").val(),
		"insurancePremiumFeeMinimum" : $("#config-insurancePremiumFeeMinimum").val(),
		"insurancePreparationFeePreCertificate" : $("#config-insurancePreparationFeePreCertificate").val(),
		"insurancePreparationFeeBasic" : $("#config-insurancePreparationFeeBasic").val()
	}
	
	// call REST API to update the details
	$.ajax({
		url: '/import-quote/v1/configureVariables',
		type: 'POST',
		contentType: 'application/json',
        data: JSON.stringify(requestData),
        success: function(data){
        	// update the view
        	updateView(requestData);
        	
        	// update the result span
        	var formattedMessage = "<h3>\" " + data + " !! \"</h3>";
        	$('#import-quote-configuration-update-message').html(formattedMessage);
        },
        error: function(e){
        	alert(e.responseText);
        }
	});
}

function updateView (requestData) {
	$("#config-exchangeRate-label").text(requestData.exchangeRate),
	$("#config-airlineImportTerminalFeePerKg-label").text(requestData.airlineImportTerminalFeePerKg),
	$("#config-airlineImportTerminalFeeMininum-label").text(requestData.airlineImportTerminalFeeMininum),
	$("#config-aircargoBreakBulkFeePerKg-label").text(requestData.aircargoBreakBulkFeePerKg),
	$("#config-aircargoBreakBulkFeeMinimum-label").text(requestData.aircargoBreakBulkFeeMinimum),
	$("#config-airportTransferFeePerKg-label").text(requestData.airportTransferFeePerKg),
	$("#config-airportTransferFeeMinimum-label").text(requestData.airportTransferFeeMinimum),
	$("#config-airlineDocumentHandlingFeePerHawb-label").text(requestData.airlineDocumentHandlingFeePerHawb),
	$("#config-cargoAutomationFeePerSupplier-label").text(requestData.cargoAutomationFeePerSupplier),
	$("#config-deliveryOrderFeePerHawb-label").text(requestData.deliveryOrderFeePerHawb),
	$("#config-customsClearanceFeePerHawb-label").text(requestData.customsClearanceFeePerHawb),
	$("#config-costPerAdditionalEntryLine-label").text(requestData.costPerAdditionalEntryLine),
	$("#config-customsCargoReportingFeePerHawb-label").text(requestData.customsCargoReportingFeePerHawb),
	$("#config-deliveryCartageFeePerKg-label").text(requestData.deliveryCartageFeePerKg),
	$("#config-deliveryCartageFeeMinimum-label").text(requestData.deliveryCartageFeeMinimum),
	$("#config-deliveryCartageFeeBasic-label").text(requestData.deliveryCartageFeeBasic),
	$("#config-deliveryCartageFeeFuelSurcharge-label").text(requestData.deliveryCartageFeeFuelSurcharge),
	$("#config-tollFeePerTrip-label").text(requestData.tollFeePerTrip),
	$("#config-insurancePremiumFee-label").text(requestData.insurancePremiumFee),
	$("#config-insurancePremiumPercentage-label").text(requestData.insurancePremiumPercentage),
	$("#config-insurancePremiumFeeMinimum-label").text(requestData.insurancePremiumFeeMinimum),
	$("#config-insurancePreparationFeePreCertificate-label").text(requestData.insurancePreparationFeePreCertificate),
	$("#config-insurancePreparationFeeBasic-label").text(requestData.insurancePreparationFeeBasic)
}