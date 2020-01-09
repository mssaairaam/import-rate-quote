package com.fms.freight.importratequote.domain;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Output fields for Quote Calculator.")
@JsonInclude(Include.NON_NULL)
public class QuoteCalculatorOutput {

	@ApiModelProperty (name = "totalEstimatedCost"
			, allowEmptyValue = false
			, example = "546.00"
			, required = true
			, value = "Total Estimated Cost of the Quote.")
	BigDecimal totalEstimatedCost;
	
	@ApiModelProperty (name = "totalEstimatedCostWithInsurance"
			, allowEmptyValue = false
			, example = "600.00"
			, required = true
			, value = "Total Estimated Cost of the Quote with Insurance Fee.")
	BigDecimal totalEstimatedCostWithInsurance;

	public BigDecimal getTotalEstimatedCost() {
		return totalEstimatedCost;
	}

	public void setTotalEstimatedCost(BigDecimal totalEstimatedCost) {
		this.totalEstimatedCost = totalEstimatedCost;
	}

	public BigDecimal getTotalEstimatedCostWithInsurance() {
		return totalEstimatedCostWithInsurance;
	}

	public void setTotalEstimatedCostWithInsurance(BigDecimal totalEstimatedCostWithInsurance) {
		this.totalEstimatedCostWithInsurance = totalEstimatedCostWithInsurance;
	}
	
	public String toString() {
		return "Total Estimated Cost : $" + totalEstimatedCost + " AUD.";
	}
}
