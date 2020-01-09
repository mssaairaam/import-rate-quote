package com.fms.freight.importratequote.quotecalc;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fms.freight.importratequote.domain.QuoteCalculatorInput;
import com.fms.freight.importratequote.domain.QuoteCalculatorOutput;
import com.fms.freight.importratequote.domain.QuoteVariables;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "Import Quote Calculator.")
public class QuoteCalculatorController {

	Logger logger = LoggerFactory.getLogger(QuoteCalculatorController.class);
	
	@Autowired
	QuoteCalculatorService quoteCalculatorService;
	
	@Autowired
	QuoteConfigureService quoteConfigureService;
	
	@RequestMapping(path = "/calculateTotalEstimatedCost", 
			method = RequestMethod.POST)
	@ApiOperation(value = "Calculates total estimated cost for a Quote.", response = QuoteCalculatorOutput.class)
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Successfully retrieved calculated cost of the qoute."),
	        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})
    public QuoteCalculatorOutput calculateEstimatedCost(@Valid @RequestBody QuoteCalculatorInput quoteCalculatorInput) {
		QuoteCalculatorOutput quoteCalculatorOutput = null;
		logger.info("Route :: /calculateTotalEstimatedCost");
		logger.info("Request -> " + quoteCalculatorInput.toString());
		quoteCalculatorOutput = quoteCalculatorService.calculateQuoteCost(quoteCalculatorInput);
		logger.info("Response -> " + quoteCalculatorOutput.toString());
        return quoteCalculatorOutput;
    }
	
	@RequestMapping(path = "/configureVariables", 
			method = RequestMethod.POST)
	@ApiOperation(value = "Configures values of the variables for calculation.", response = String.class)
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Successfully updated the variables for calculation."),
	        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})
    public String configureVariables(@Valid @RequestBody QuoteVariables quoteVariables) {
		String configuredMessage = null;
		logger.info("Route :: /configureVariables");
		logger.info("Request -> " + quoteVariables.toString());
		configuredMessage = quoteConfigureService.configureQuoteVariables(quoteVariables);
		logger.info("Response -> " + configuredMessage.toString());
        return configuredMessage;
    }
	
	@RequestMapping(path = "/health", 
			method = RequestMethod.GET)
	@ResponseBody
    public String health() {
        return "Import Quote Calculator application is up and running healthy.";
    }
}
