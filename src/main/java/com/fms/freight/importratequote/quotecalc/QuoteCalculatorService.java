package com.fms.freight.importratequote.quotecalc;

import java.math.BigDecimal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fms.freight.importratequote.domain.QuoteCalculatorInput;
import com.fms.freight.importratequote.domain.QuoteCalculatorOutput;
import com.fms.freight.importratequote.domain.QuoteVariables;

@Service
public class QuoteCalculatorService {

	@Autowired
	QuoteVariables quoteVariables;

	public QuoteCalculatorOutput calculateQuoteCost(@Valid QuoteCalculatorInput quoteCalculatorInput) {
		QuoteCalculatorOutput quotationCalculatorOutput = new QuoteCalculatorOutput();
		
		// get input values
		Double freightWeight = quoteCalculatorInput.getWeight();
		Double freightVolume = quoteCalculatorInput.getVolume();
		
		// ** calculation of various charges **
		// freight dimensions and rate calculation
		BigDecimal chargeableWeight = calculateChargeableWeight(freightWeight, freightVolume);
//		BigDecimal exchangeRateWithCurrencyAdjustment = calculateExchangeRateWithCurrencyAdjustment();

		// import charges
		BigDecimal airlineImportTerminalFee = calculateAirlineImportTerminalFee(chargeableWeight);
		BigDecimal aircargoBreakBulkFee = calculateAircargoBreakBulkFee(chargeableWeight);
		BigDecimal airportTransferFee = calculateAirportTransferFee(chargeableWeight);
		BigDecimal importChargestotal = airlineImportTerminalFee
				.add(aircargoBreakBulkFee)
				.add(airportTransferFee) 
				.add(quoteVariables.getAirlineDocumentHandlingFeePerHawb())
				.add(quoteVariables.getCargoAutomationFeePerSupplier())
				.add(quoteVariables.getDeliveryOrderFeePerHawb());
		
		// clearance and delivery charges
		BigDecimal additionalEntryLinesTotalCost = caculateAdditionalEntryLinesCost();
		BigDecimal deliveryCartageFee = calculateDeliveryCartageFee(chargeableWeight);
		BigDecimal deliveryCartageFuelSurcharge = calculateCartageFuelSurcharge(deliveryCartageFee);
		BigDecimal otherChargesTotal = new BigDecimal("0.00");
		BigDecimal tollFee = new BigDecimal("0.00");
		BigDecimal clearanceAndDeliveryTotalCharges = quoteVariables.getCustomsClearanceFeePerHawb()
				.add(additionalEntryLinesTotalCost) 
				.add(quoteVariables.getCustomsCargoReportingFeePerHawb())
				.add(deliveryCartageFee)
				.add(deliveryCartageFuelSurcharge) 
				.add(otherChargesTotal)
				.add(tollFee);
		
		// insurance charges
//		BigDecimal insuredAmount = new BigDecimal("0.00");
//		BigDecimal insurancePremiumCharges = calculateInsurancePremiumCharges(insuredAmount);
//		BigDecimal totalInsuranceCharges = insurancePremiumCharges.add(insurancePreparationFeeBasic);
		
		// total charges without insurance
		BigDecimal totalEstimatedCost = importChargestotal.add(clearanceAndDeliveryTotalCharges);
		totalEstimatedCost = totalEstimatedCost.setScale(2, BigDecimal.ROUND_UP);
		quotationCalculatorOutput.setTotalEstimatedCost(totalEstimatedCost);
		
		// total charges with insurance
//		BigDecimal totalEstimatedCostWithInsurance = totalEstimatedCost.add(totalInsuranceCharges);
//		totalEstimatedCostWithInsurance = totalEstimatedCostWithInsurance.setScale(2, BigDecimal.ROUND_UP);
//		quotationCalculatorOutput.setTotalEstimatedCostWithInsurance(totalEstimatedCostWithInsurance);
		
		return quotationCalculatorOutput;
	}

	/*private BigDecimal calculateInsurancePremiumCharges(BigDecimal insuredAmount) {
		BigDecimal insurancePremiumCharges = new BigDecimal("0.00");
		BigDecimal calculatedInsurancePremiumCharges = insuredAmount.multiply(insurancePremiumPercentage);
		if (calculatedInsurancePremiumCharges.compareTo(insurancePremiumFeeMinimum) == -1) {
			insurancePremiumCharges = insurancePremiumFeeMinimum;
		} else {
			insurancePremiumCharges = calculatedInsurancePremiumCharges;
		}
		return insurancePremiumCharges;
	}*/

	private BigDecimal calculateCartageFuelSurcharge(BigDecimal deliveryCartageFee) {
		return deliveryCartageFee.multiply(quoteVariables.getDeliveryCartageFeeFuelSurcharge());
	}

	private BigDecimal calculateDeliveryCartageFee(BigDecimal chargeableWeight) {
		BigDecimal deliveryCartageFee = new BigDecimal("0.00");
		BigDecimal calculatedDeliveryCartageFee = chargeableWeight.multiply(quoteVariables.getDeliveryCartageFeePerKg())
				.add(quoteVariables.getDeliveryCartageFeeBasic());
		if (calculatedDeliveryCartageFee.compareTo(quoteVariables.getDeliveryCartageFeeMinimum()) == 1) {
			deliveryCartageFee = calculatedDeliveryCartageFee;
		} else {
			deliveryCartageFee = quoteVariables.getDeliveryCartageFeeMinimum();
		}
		return deliveryCartageFee;
	}

	private BigDecimal caculateAdditionalEntryLinesCost() {
		int noOfAdditionalEntryLines = 0;	
		return quoteVariables.getCostPerAdditionalEntryLine().multiply(new BigDecimal(noOfAdditionalEntryLines));
	}

	private BigDecimal calculateAirportTransferFee(BigDecimal chargeableWeight) {
		BigDecimal airportTransferFee = new BigDecimal("0.00");
		BigDecimal calculatedAirportTransferFee = chargeableWeight.multiply(quoteVariables.getAirportTransferFeePerKg());
		if (calculatedAirportTransferFee.compareTo(quoteVariables.getAirportTransferFeeMinimum()) == -1) {
			airportTransferFee = quoteVariables.getAirportTransferFeeMinimum();
		} else {
			airportTransferFee = calculatedAirportTransferFee;
		}
		return airportTransferFee;
	}

	private BigDecimal calculateAircargoBreakBulkFee(BigDecimal chargeableWeight) {
		BigDecimal aircargoBreakBulkFee = new BigDecimal("0.00");
		BigDecimal calculatedAircargoBreakBulkFee = chargeableWeight.multiply(quoteVariables.getAircargoBreakBulkFeePerKg());
		if (calculatedAircargoBreakBulkFee.compareTo(quoteVariables.getAircargoBreakBulkFeeMinimum()) == -1) {
			aircargoBreakBulkFee = quoteVariables.getAircargoBreakBulkFeeMinimum();
		} else {
			aircargoBreakBulkFee = calculatedAircargoBreakBulkFee;
		}
		return aircargoBreakBulkFee;
	}

	private BigDecimal calculateAirlineImportTerminalFee(BigDecimal chargeableWeight) {
		BigDecimal airlineImportTerminalFee = new BigDecimal("0.00");
		BigDecimal calculatedAirlineImportTerminalFee = chargeableWeight.multiply(quoteVariables.getAirlineImportTerminalFeePerKg());
		if (calculatedAirlineImportTerminalFee.compareTo(quoteVariables.getAirlineImportTerminalFeeMininum()) == -1) {
			airlineImportTerminalFee = quoteVariables.getAirlineImportTerminalFeeMininum();
		} else {
			airlineImportTerminalFee = calculatedAirlineImportTerminalFee;
		}
		return airlineImportTerminalFee;
	}

	/*private BigDecimal calculateExchangeRateWithCurrencyAdjustment() {
		return (exchangeRate.multiply(BigDecimal.ONE.subtract(currencyAdjustment)));
	}*/

	private BigDecimal calculateChargeableWeight(Double freightWeight, Double freightVolume) {
		BigDecimal chargeableWeight = new BigDecimal("0.00");
		Double calculatedVolume = new Double(freightVolume * (1000000 / 6000));
		if (freightWeight > calculatedVolume) {
			chargeableWeight = new BigDecimal(freightWeight);
		} else {
			chargeableWeight = new BigDecimal(calculatedVolume);
		}
		return chargeableWeight;
	}
}
