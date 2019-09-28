/**
 * Import Quote Details Processing.
 */
function calculateQuote() {
	var weight = $.trim($("#import-quote-weight").val());
	var volume = $.trim($("#import-quote-volume").val());
	var destinationAirport = $.trim($("#import-quote-destination-airport").val());
	
	// empty result P tag
	$('#import-quote-calculated-quote-value').html("");
	
	// form request body
	var requestData = {
	  "destinationAirport": destinationAirport,
	  "volume": volume,
	  "weight": weight
	}
	
	// call REST API to update the details
	$.ajax({
		url: '/import-quote/v1/calculateTotalEstimatedCost',
		type: 'POST',
		contentType: 'application/json',
        data: JSON.stringify(requestData),
        dataType: 'json',
        success: function(data){
        	// update the result span
        	var updatedText = "Total Estimated Cost of the Quote is <h2>$ " + data.totalEstimatedCost + " AUD</h2>";
        	$('#import-quote-calculated-quote-value').html(updatedText);
        },
        error: function(e){
        	alert(e.responseText);
        }
	});
}