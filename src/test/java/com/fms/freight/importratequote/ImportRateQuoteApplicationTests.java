package com.fms.freight.importratequote;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fms.freight.importratequote.ImportRateQuoteApplication;
import com.fms.freight.importratequote.domain.QuoteCalculatorInput;
import com.fms.freight.importratequote.domain.QuoteCalculatorOutput;
import com.fms.freight.importratequote.quotecalc.QuoteCalculatorController;
import com.fms.freight.importratequote.quotecalc.QuoteCalculatorService;


@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ImportRateQuoteApplication.class)
public class ImportRateQuoteApplicationTests {
	
	private static QuoteCalculatorInput quoteCalculatorInput = new QuoteCalculatorInput();
	
	@BeforeClass
	public static void loadQuoteCalculatorInput() {
		quoteCalculatorInput.setWeight(90.00);
		quoteCalculatorInput.setVolume(53.45);
	}
	
	@Autowired
	private QuoteCalculatorService quoteCalculatorService;
	
	@Autowired
	private QuoteCalculatorController quoteCalculatorController;

	@Test
	public void whenWeightIsProvided_VolumeIsProvided() {
		QuoteCalculatorOutput quoteCalculatorOutput = new QuoteCalculatorOutput();
		quoteCalculatorOutput.setTotalEstimatedCost(new BigDecimal("9997.85"));
		
		Mockito.when(quoteCalculatorService.calculateQuoteCost(quoteCalculatorInput))
			.thenReturn(quoteCalculatorOutput);
		// test
		QuoteCalculatorOutput actualQuoteCalculatorOutput = quoteCalculatorController.calculateEstimatedCost(quoteCalculatorInput);
		Assert.assertEquals(new BigDecimal("9997.85"), actualQuoteCalculatorOutput.getTotalEstimatedCost());
	}

	@Test
	public void whenWeightIsOnlyProvided() {
		// set input
		quoteCalculatorInput.setWeight(90.00);
		quoteCalculatorInput.setVolume(0.0);
		
		// set output
		QuoteCalculatorOutput quoteCalculatorOutput = new QuoteCalculatorOutput();
		quoteCalculatorOutput.setTotalEstimatedCost(new BigDecimal("465.6"));
		
		Mockito.when(quoteCalculatorService.calculateQuoteCost(quoteCalculatorInput))
			.thenReturn(quoteCalculatorOutput);
		// test
		QuoteCalculatorOutput actualQuoteCalculatorOutput = quoteCalculatorController.calculateEstimatedCost(quoteCalculatorInput);
		Assert.assertEquals(new BigDecimal("465.6"), actualQuoteCalculatorOutput.getTotalEstimatedCost());
	}

	@Test
	public void whenVolumeIsOnlyProvided() {
		// set input
		quoteCalculatorInput.setWeight(0.0);
		quoteCalculatorInput.setVolume(1.2);
		
		// set output
		QuoteCalculatorOutput quoteCalculatorOutput = new QuoteCalculatorOutput();
		quoteCalculatorOutput.setTotalEstimatedCost(new BigDecimal("524.13"));
		
		Mockito.when(quoteCalculatorService.calculateQuoteCost(quoteCalculatorInput))
			.thenReturn(quoteCalculatorOutput);
		// test
		QuoteCalculatorOutput actualQuoteCalculatorOutput = quoteCalculatorController.calculateEstimatedCost(quoteCalculatorInput);
		Assert.assertEquals(new BigDecimal("524.13"), actualQuoteCalculatorOutput.getTotalEstimatedCost());
	}
}
