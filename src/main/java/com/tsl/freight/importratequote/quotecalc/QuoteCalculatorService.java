package com.tsl.freight.importratequote.quotecalc;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.tsl.freight.importratequote.domain.QuoteCalculatorInput;
import com.tsl.freight.importratequote.domain.QuoteCalculatorOutput;
import static com.tsl.freight.importratequote.util.Constants.*;

import java.math.BigDecimal;

@Service
public class QuoteCalculatorService {

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
				.add(airlineDocumentHandlingFeePerHawb)
				.add(cargoAutomationFeePerSupplier)
				.add(deliveryOrderFeePerHawb);
		
		// clearance and delivery charges
		BigDecimal additionalEntryLinesTotalCost = caculateAdditionalEntryLinesCost();
		BigDecimal deliveryCartageFee = calculateDeliveryCartageFee(chargeableWeight);
		BigDecimal deliveryCartageFuelSurcharge = calculateCartageFuelSurcharge(deliveryCartageFee);
		BigDecimal otherChargesTotal = new BigDecimal("0.00");
		BigDecimal tollFee = new BigDecimal("0.00");
		BigDecimal clearanceAndDeliveryTotalCharges = customsClearanceFeePerHawb
				.add(additionalEntryLinesTotalCost) 
				.add(customsCargoReportingFeePerHawb)
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
		return deliveryCartageFee.multiply(deliveryCartageFeeFuelSurcharge);
	}

	private BigDecimal calculateDeliveryCartageFee(BigDecimal chargeableWeight) {
		BigDecimal deliveryCartageFee = new BigDecimal("0.00");
		BigDecimal calculatedDeliveryCartageFee = chargeableWeight.multiply(deliveryCartageFeePerKg).add(deliveryCartageFeeBasic);
		if (calculatedDeliveryCartageFee.compareTo(deliveryCartageFeeMinimum) == 1) {
			deliveryCartageFee = calculatedDeliveryCartageFee;
		} else {
			deliveryCartageFee = deliveryCartageFeeMinimum;
		}
		return deliveryCartageFee;
	}

	private BigDecimal caculateAdditionalEntryLinesCost() {
		int noOfAdditionalEntryLines = 0;	
		return costPerAdditionalEntryLine.multiply(new BigDecimal(noOfAdditionalEntryLines));
	}

	private BigDecimal calculateAirportTransferFee(BigDecimal chargeableWeight) {
		BigDecimal airportTransferFee = new BigDecimal("0.00");
		BigDecimal calculatedAirportTransferFee = chargeableWeight.multiply(airportTransferFeePerKg);
		if (calculatedAirportTransferFee.compareTo(airportTransferFeeMinimum) == -1) {
			airportTransferFee = airportTransferFeeMinimum;
		} else {
			airportTransferFee = calculatedAirportTransferFee;
		}
		return airportTransferFee;
	}

	private BigDecimal calculateAircargoBreakBulkFee(BigDecimal chargeableWeight) {
		BigDecimal aircargoBreakBulkFee = new BigDecimal("0.00");
		BigDecimal calculatedAircargoBreakBulkFee = chargeableWeight.multiply(aircargoBreakBulkFeePerKg);
		if (calculatedAircargoBreakBulkFee.compareTo(aircargoBreakBulkFeeMinimum) == -1) {
			aircargoBreakBulkFee = aircargoBreakBulkFeeMinimum;
		} else {
			aircargoBreakBulkFee = calculatedAircargoBreakBulkFee;
		}
		return aircargoBreakBulkFee;
	}

	private BigDecimal calculateAirlineImportTerminalFee(BigDecimal chargeableWeight) {
		BigDecimal airlineImportTerminalFee = new BigDecimal("0.00");
		BigDecimal calculatedAirlineImportTerminalFee = chargeableWeight.multiply(airlineImportTerminalFeePerKg);
		if (calculatedAirlineImportTerminalFee.compareTo(airlineImportTerminalFeeMininum) == -1) {
			airlineImportTerminalFee = airlineImportTerminalFeeMininum;
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
