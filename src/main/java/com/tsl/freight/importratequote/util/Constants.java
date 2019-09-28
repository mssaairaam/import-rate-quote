package com.tsl.freight.importratequote.util;

import java.math.BigDecimal;

/**
 * Constants defined for Import Quote Cost calculation.
 * @author Sairam
 *
 */
public class Constants {
	public static final BigDecimal currencyAdjustment = new BigDecimal("0.03");
	public static final BigDecimal exchangeRate = new BigDecimal("0.7200");

	// *** Import Charges ***
	public static final BigDecimal airlineImportTerminalFeePerKg = new BigDecimal("0.59");
	public static final BigDecimal airlineImportTerminalFeeMininum = new BigDecimal("59.00");
	
	public static final BigDecimal aircargoBreakBulkFeePerKg = new BigDecimal("0.30");
	public static final BigDecimal aircargoBreakBulkFeeMinimum = new BigDecimal("60.0");

	public static final BigDecimal airportTransferFeePerKg = new BigDecimal("0.04");
	public static final BigDecimal airportTransferFeeMinimum = new BigDecimal("15.00");
	
	public static final BigDecimal airlineDocumentHandlingFeePerHawb = new BigDecimal("59.00");

	public static final BigDecimal cargoAutomationFeePerSupplier = new BigDecimal("15.00");
	
	public static final BigDecimal deliveryOrderFeePerHawb = new BigDecimal("25.00");
	
	// *** Customs Clearance and Delivery ***
	public static final BigDecimal customsClearanceFeePerHawb = new BigDecimal("105.00");
	public static final BigDecimal costPerAdditionalEntryLine = new BigDecimal("2.50");
	
	public static final BigDecimal customsCargoReportingFeePerHawb = new BigDecimal("25.00");
	
	public static final BigDecimal deliveryCartageFeePerKg = new BigDecimal("0.15");
	public static final BigDecimal deliveryCartageFeeMinimum = new BigDecimal("90.00");
	public static final BigDecimal deliveryCartageFeeBasic = new BigDecimal("0.00");
	public static final BigDecimal deliveryCartageFeeFuelSurcharge = new BigDecimal("0.14");
	
	public static final BigDecimal customsClearanceDeliveryOtherChargesPerItem = new BigDecimal("0.00");
	public static final BigDecimal customsClearanceDeliveryOtherChargesMiimum = new BigDecimal("0.00");
	public static final BigDecimal customsClearanceDeliveryOtherChargesBasic = new BigDecimal("0.00");
	
	public static final BigDecimal tollFeePerTrip = new BigDecimal("0.00");
	
	public static final BigDecimal insurancePremiumFee = new BigDecimal("0.0");
	public static final BigDecimal insurancePremiumPercentage = new BigDecimal("0.0020");
	public static final BigDecimal insurancePremiumFeeMinimum = new BigDecimal("50.00");
	
	public static final BigDecimal insurancePreparationFeePreCertificate = new BigDecimal("20.00");
	public static final BigDecimal insurancePreparationFeeBasic = new BigDecimal("20.00");
}
