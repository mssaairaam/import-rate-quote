package com.fms.freight.importratequote.domain;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class QuoteVariables {

	BigDecimal currencyAdjustment = new BigDecimal("0.03");
	BigDecimal exchangeRate = new BigDecimal("0.7200");
	BigDecimal airlineImportTerminalFeePerKg = new BigDecimal("0.59");
	BigDecimal airlineImportTerminalFeeMininum = new BigDecimal("59.00");
	BigDecimal aircargoBreakBulkFeePerKg = new BigDecimal("0.30");
	BigDecimal aircargoBreakBulkFeeMinimum = new BigDecimal("60.0");
	BigDecimal airportTransferFeePerKg = new BigDecimal("0.04");
	BigDecimal airportTransferFeeMinimum = new BigDecimal("15.00");
	BigDecimal airlineDocumentHandlingFeePerHawb = new BigDecimal("59.00");
	BigDecimal cargoAutomationFeePerSupplier = new BigDecimal("15.00");
	BigDecimal deliveryOrderFeePerHawb = new BigDecimal("25.00");
	BigDecimal customsClearanceFeePerHawb = new BigDecimal("105.00");
	BigDecimal costPerAdditionalEntryLine = new BigDecimal("2.50");
	BigDecimal customsCargoReportingFeePerHawb = new BigDecimal("25.00");
	BigDecimal deliveryCartageFeePerKg = new BigDecimal("0.15");
	BigDecimal deliveryCartageFeeMinimum = new BigDecimal("90.00");
	BigDecimal deliveryCartageFeeBasic = new BigDecimal("0.00");
	BigDecimal deliveryCartageFeeFuelSurcharge = new BigDecimal("0.14");
	BigDecimal customsClearanceDeliveryOtherChargesPerItem = new BigDecimal("0.00");
	BigDecimal customsClearanceDeliveryOtherChargesMiimum = new BigDecimal("0.00");
	BigDecimal customsClearanceDeliveryOtherChargesBasic = new BigDecimal("0.00");
	BigDecimal tollFeePerTrip = new BigDecimal("0.00");
	BigDecimal insurancePremiumFee = new BigDecimal("0.0");
	BigDecimal insurancePremiumPercentage = new BigDecimal("0.0020");
	BigDecimal insurancePremiumFeeMinimum = new BigDecimal("50.00");
	BigDecimal insurancePreparationFeePreCertificate = new BigDecimal("20.00");
	BigDecimal insurancePreparationFeeBasic = new BigDecimal("20.00");
	
	public BigDecimal getCurrencyAdjustment() {
		return currencyAdjustment;
	}
	public void setCurrencyAdjustment(BigDecimal currencyAdjustment) {
		this.currencyAdjustment = currencyAdjustment;
	}
	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public BigDecimal getAirlineImportTerminalFeePerKg() {
		return airlineImportTerminalFeePerKg;
	}
	public void setAirlineImportTerminalFeePerKg(BigDecimal airlineImportTerminalFeePerKg) {
		this.airlineImportTerminalFeePerKg = airlineImportTerminalFeePerKg;
	}
	public BigDecimal getAirlineImportTerminalFeeMininum() {
		return airlineImportTerminalFeeMininum;
	}
	public void setAirlineImportTerminalFeeMininum(BigDecimal airlineImportTerminalFeeMininum) {
		this.airlineImportTerminalFeeMininum = airlineImportTerminalFeeMininum;
	}
	public BigDecimal getAircargoBreakBulkFeePerKg() {
		return aircargoBreakBulkFeePerKg;
	}
	public void setAircargoBreakBulkFeePerKg(BigDecimal aircargoBreakBulkFeePerKg) {
		this.aircargoBreakBulkFeePerKg = aircargoBreakBulkFeePerKg;
	}
	public BigDecimal getAircargoBreakBulkFeeMinimum() {
		return aircargoBreakBulkFeeMinimum;
	}
	public void setAircargoBreakBulkFeeMinimum(BigDecimal aircargoBreakBulkFeeMinimum) {
		this.aircargoBreakBulkFeeMinimum = aircargoBreakBulkFeeMinimum;
	}
	public BigDecimal getAirportTransferFeePerKg() {
		return airportTransferFeePerKg;
	}
	public void setAirportTransferFeePerKg(BigDecimal airportTransferFeePerKg) {
		this.airportTransferFeePerKg = airportTransferFeePerKg;
	}
	public BigDecimal getAirportTransferFeeMinimum() {
		return airportTransferFeeMinimum;
	}
	public void setAirportTransferFeeMinimum(BigDecimal airportTransferFeeMinimum) {
		this.airportTransferFeeMinimum = airportTransferFeeMinimum;
	}
	public BigDecimal getAirlineDocumentHandlingFeePerHawb() {
		return airlineDocumentHandlingFeePerHawb;
	}
	public void setAirlineDocumentHandlingFeePerHawb(BigDecimal airlineDocumentHandlingFeePerHawb) {
		this.airlineDocumentHandlingFeePerHawb = airlineDocumentHandlingFeePerHawb;
	}
	public BigDecimal getCargoAutomationFeePerSupplier() {
		return cargoAutomationFeePerSupplier;
	}
	public void setCargoAutomationFeePerSupplier(BigDecimal cargoAutomationFeePerSupplier) {
		this.cargoAutomationFeePerSupplier = cargoAutomationFeePerSupplier;
	}
	public BigDecimal getDeliveryOrderFeePerHawb() {
		return deliveryOrderFeePerHawb;
	}
	public void setDeliveryOrderFeePerHawb(BigDecimal deliveryOrderFeePerHawb) {
		this.deliveryOrderFeePerHawb = deliveryOrderFeePerHawb;
	}
	public BigDecimal getCustomsClearanceFeePerHawb() {
		return customsClearanceFeePerHawb;
	}
	public void setCustomsClearanceFeePerHawb(BigDecimal customsClearanceFeePerHawb) {
		this.customsClearanceFeePerHawb = customsClearanceFeePerHawb;
	}
	public BigDecimal getCostPerAdditionalEntryLine() {
		return costPerAdditionalEntryLine;
	}
	public void setCostPerAdditionalEntryLine(BigDecimal costPerAdditionalEntryLine) {
		this.costPerAdditionalEntryLine = costPerAdditionalEntryLine;
	}
	public BigDecimal getCustomsCargoReportingFeePerHawb() {
		return customsCargoReportingFeePerHawb;
	}
	public void setCustomsCargoReportingFeePerHawb(BigDecimal customsCargoReportingFeePerHawb) {
		this.customsCargoReportingFeePerHawb = customsCargoReportingFeePerHawb;
	}
	public BigDecimal getDeliveryCartageFeePerKg() {
		return deliveryCartageFeePerKg;
	}
	public void setDeliveryCartageFeePerKg(BigDecimal deliveryCartageFeePerKg) {
		this.deliveryCartageFeePerKg = deliveryCartageFeePerKg;
	}
	public BigDecimal getDeliveryCartageFeeMinimum() {
		return deliveryCartageFeeMinimum;
	}
	public void setDeliveryCartageFeeMinimum(BigDecimal deliveryCartageFeeMinimum) {
		this.deliveryCartageFeeMinimum = deliveryCartageFeeMinimum;
	}
	public BigDecimal getDeliveryCartageFeeBasic() {
		return deliveryCartageFeeBasic;
	}
	public void setDeliveryCartageFeeBasic(BigDecimal deliveryCartageFeeBasic) {
		this.deliveryCartageFeeBasic = deliveryCartageFeeBasic;
	}
	public BigDecimal getDeliveryCartageFeeFuelSurcharge() {
		return deliveryCartageFeeFuelSurcharge;
	}
	public void setDeliveryCartageFeeFuelSurcharge(BigDecimal deliveryCartageFeeFuelSurcharge) {
		this.deliveryCartageFeeFuelSurcharge = deliveryCartageFeeFuelSurcharge;
	}
	public BigDecimal getCustomsClearanceDeliveryOtherChargesPerItem() {
		return customsClearanceDeliveryOtherChargesPerItem;
	}
	public void setCustomsClearanceDeliveryOtherChargesPerItem(BigDecimal customsClearanceDeliveryOtherChargesPerItem) {
		this.customsClearanceDeliveryOtherChargesPerItem = customsClearanceDeliveryOtherChargesPerItem;
	}
	public BigDecimal getCustomsClearanceDeliveryOtherChargesMiimum() {
		return customsClearanceDeliveryOtherChargesMiimum;
	}
	public void setCustomsClearanceDeliveryOtherChargesMiimum(BigDecimal customsClearanceDeliveryOtherChargesMiimum) {
		this.customsClearanceDeliveryOtherChargesMiimum = customsClearanceDeliveryOtherChargesMiimum;
	}
	public BigDecimal getCustomsClearanceDeliveryOtherChargesBasic() {
		return customsClearanceDeliveryOtherChargesBasic;
	}
	public void setCustomsClearanceDeliveryOtherChargesBasic(BigDecimal customsClearanceDeliveryOtherChargesBasic) {
		this.customsClearanceDeliveryOtherChargesBasic = customsClearanceDeliveryOtherChargesBasic;
	}
	public BigDecimal getTollFeePerTrip() {
		return tollFeePerTrip;
	}
	public void setTollFeePerTrip(BigDecimal tollFeePerTrip) {
		this.tollFeePerTrip = tollFeePerTrip;
	}
	public BigDecimal getInsurancePremiumFee() {
		return insurancePremiumFee;
	}
	public void setInsurancePremiumFee(BigDecimal insurancePremiumFee) {
		this.insurancePremiumFee = insurancePremiumFee;
	}
	public BigDecimal getInsurancePremiumPercentage() {
		return insurancePremiumPercentage;
	}
	public void setInsurancePremiumPercentage(BigDecimal insurancePremiumPercentage) {
		this.insurancePremiumPercentage = insurancePremiumPercentage;
	}
	public BigDecimal getInsurancePremiumFeeMinimum() {
		return insurancePremiumFeeMinimum;
	}
	public void setInsurancePremiumFeeMinimum(BigDecimal insurancePremiumFeeMinimum) {
		this.insurancePremiumFeeMinimum = insurancePremiumFeeMinimum;
	}
	public BigDecimal getInsurancePreparationFeePreCertificate() {
		return insurancePreparationFeePreCertificate;
	}
	public void setInsurancePreparationFeePreCertificate(BigDecimal insurancePreparationFeePreCertificate) {
		this.insurancePreparationFeePreCertificate = insurancePreparationFeePreCertificate;
	}
	public BigDecimal getInsurancePreparationFeeBasic() {
		return insurancePreparationFeeBasic;
	}
	public void setInsurancePreparationFeeBasic(BigDecimal insurancePreparationFeeBasic) {
		this.insurancePreparationFeeBasic = insurancePreparationFeeBasic;
	}
	
	@Override
	public String toString() {
		StringBuffer quoteVariablesRepresentation = new StringBuffer();
		quoteVariablesRepresentation
			.append("{")
			.append("currencyAdjustment:" + currencyAdjustment).append(",")
			.append("exchangeRate:" + exchangeRate).append(",")
			.append("airlineImportTerminalFeePerKg:" + airlineImportTerminalFeePerKg).append(",")
			.append("airlineImportTerminalFeeMininum:" + airlineImportTerminalFeeMininum).append(",")
			.append("aircargoBreakBulkFeePerKg:" + aircargoBreakBulkFeePerKg).append(",")
			.append("aircargoBreakBulkFeeMinimum:" + aircargoBreakBulkFeeMinimum).append(",")
			.append("airportTransferFeePerKg:" + airportTransferFeePerKg).append(",")
			.append("airportTransferFeeMinimum:" + airportTransferFeeMinimum).append(",")
			.append("airlineDocumentHandlingFeePerHawb:" + airlineDocumentHandlingFeePerHawb).append(",")
			.append("cargoAutomationFeePerSupplier:" + cargoAutomationFeePerSupplier).append(",")
			.append("deliveryOrderFeePerHawb:" + deliveryOrderFeePerHawb).append(",")
			.append("customsClearanceFeePerHawb:" + customsClearanceFeePerHawb).append(",")
			.append("costPerAdditionalEntryLine:" + costPerAdditionalEntryLine).append(",")
			.append("customsCargoReportingFeePerHawb:" + customsCargoReportingFeePerHawb).append(",")
			.append("deliveryCartageFeePerKg:" + deliveryCartageFeePerKg).append(",")
			.append("deliveryCartageFeeMinimum:" + deliveryCartageFeeMinimum).append(",")
			.append("deliveryCartageFeeBasic:" + deliveryCartageFeeBasic).append(",")
			.append("deliveryCartageFeeFuelSurcharge:" + deliveryCartageFeeFuelSurcharge).append(",")
			.append("customsClearanceDeliveryOtherChargesPerItem:" + customsClearanceDeliveryOtherChargesPerItem).append(",")
			.append("customsClearanceDeliveryOtherChargesMiimum:" + customsClearanceDeliveryOtherChargesMiimum).append(",")
			.append("customsClearanceDeliveryOtherChargesBasic:" + customsClearanceDeliveryOtherChargesBasic).append(",")
			.append("tollFeePerTrip:" + tollFeePerTrip).append(",")
			.append("insurancePremiumFee:" + insurancePremiumFee).append(",")
			.append("insurancePremiumPercentage:" + insurancePremiumPercentage).append(",")
			.append("insurancePremiumFeeMinimum:" + insurancePremiumFeeMinimum).append(",")
			.append("insurancePreparationFeePreCertificate:" + insurancePreparationFeePreCertificate).append(",")
			.append("insurancePreparationFeeBasic:" + insurancePreparationFeeBasic)
			.append("}");
		return quoteVariablesRepresentation.toString();
	}
}
