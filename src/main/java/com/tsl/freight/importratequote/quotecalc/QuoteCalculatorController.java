package com.tsl.freight.importratequote.quotecalc;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tsl.freight.importratequote.domain.QuoteCalculatorInput;
import com.tsl.freight.importratequote.domain.QuoteCalculatorOutput;

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
		logger.info("Request -> " + quoteCalculatorInput.toString());
		quoteCalculatorOutput = quoteCalculatorService.calculateQuoteCost(quoteCalculatorInput);
		logger.info("Response -> " + quoteCalculatorOutput.toString());
        return quoteCalculatorOutput;
    }
	
	@RequestMapping(path = "/health", 
			method = RequestMethod.GET)
	@ResponseBody
    public String health() {
        return "Import Quote Calculator application is up and running healthy.";
    }
}
