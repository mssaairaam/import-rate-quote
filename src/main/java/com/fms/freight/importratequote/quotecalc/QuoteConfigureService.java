package com.fms.freight.importratequote.quotecalc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fms.freight.importratequote.domain.QuoteVariables;

@Service
public class QuoteConfigureService {

	@Autowired
	QuoteVariables quoteVariables;
	
	public String configureQuoteVariables(QuoteVariables quoteVariablesToConfigure) {
		String configureMessage = "Quote Variables are Updated Successfully";
		
		quoteVariables.setAircargoBreakBulkFeeMinimum(quoteVariablesToConfigure.getAircargoBreakBulkFeeMinimum());
		quoteVariables.setAircargoBreakBulkFeePerKg(quoteVariablesToConfigure.getAircargoBreakBulkFeePerKg());
		
		quoteVariables.setAirlineDocumentHandlingFeePerHawb(quoteVariablesToConfigure.getAirlineDocumentHandlingFeePerHawb());
		quoteVariables.setAirlineImportTerminalFeeMininum(quoteVariablesToConfigure.getAirlineImportTerminalFeeMininum());
		quoteVariables.setAirlineImportTerminalFeePerKg(quoteVariablesToConfigure.getAirlineImportTerminalFeePerKg());
		
		quoteVariables.setAirportTransferFeeMinimum(quoteVariablesToConfigure.getAirportTransferFeeMinimum());
		quoteVariables.setAirportTransferFeePerKg(quoteVariablesToConfigure.getAirportTransferFeePerKg());
		
		quoteVariables.setCargoAutomationFeePerSupplier(quoteVariablesToConfigure.getCargoAutomationFeePerSupplier());
		quoteVariables.setCostPerAdditionalEntryLine(quoteVariablesToConfigure.getCostPerAdditionalEntryLine());
		quoteVariables.setCurrencyAdjustment(quoteVariablesToConfigure.getCurrencyAdjustment());
		
		quoteVariables.setCustomsCargoReportingFeePerHawb(quoteVariablesToConfigure.getCustomsCargoReportingFeePerHawb());
		quoteVariables.setCustomsClearanceDeliveryOtherChargesBasic(quoteVariablesToConfigure.getCustomsClearanceDeliveryOtherChargesBasic());
		quoteVariables.setCustomsClearanceDeliveryOtherChargesMiimum(quoteVariablesToConfigure.getCustomsClearanceDeliveryOtherChargesMiimum());
		quoteVariables.setCustomsClearanceDeliveryOtherChargesPerItem(quoteVariablesToConfigure.getCustomsClearanceDeliveryOtherChargesPerItem());
		quoteVariables.setCustomsClearanceFeePerHawb(quoteVariablesToConfigure.getCustomsClearanceFeePerHawb());
		
		quoteVariables.setDeliveryCartageFeeBasic(quoteVariablesToConfigure.getDeliveryCartageFeeBasic());
		quoteVariables.setDeliveryCartageFeeFuelSurcharge(quoteVariablesToConfigure.getDeliveryCartageFeeFuelSurcharge());
		quoteVariables.setDeliveryCartageFeeMinimum(quoteVariablesToConfigure.getDeliveryCartageFeeMinimum());
		quoteVariables.setDeliveryCartageFeePerKg(quoteVariablesToConfigure.getDeliveryCartageFeePerKg());
		quoteVariables.setDeliveryOrderFeePerHawb(quoteVariablesToConfigure.getDeliveryOrderFeePerHawb());
		
		quoteVariables.setExchangeRate(quoteVariablesToConfigure.getExchangeRate());
		
		quoteVariables.setInsurancePremiumFee(quoteVariablesToConfigure.getInsurancePremiumFee());
		quoteVariables.setInsurancePremiumFeeMinimum(quoteVariablesToConfigure.getInsurancePremiumFeeMinimum());
		quoteVariables.setInsurancePremiumPercentage(quoteVariablesToConfigure.getInsurancePremiumPercentage());
		quoteVariables.setInsurancePreparationFeeBasic(quoteVariablesToConfigure.getInsurancePreparationFeeBasic());
		quoteVariables.setInsurancePreparationFeePreCertificate(quoteVariablesToConfigure.getInsurancePreparationFeePreCertificate());
		
		quoteVariables.setTollFeePerTrip(quoteVariablesToConfigure.getTollFeePerTrip());
		
		return configureMessage;
	}
}
