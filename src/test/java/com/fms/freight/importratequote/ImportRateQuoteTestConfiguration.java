package com.fms.freight.importratequote;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.fms.freight.importratequote.quotecalc.QuoteCalculatorService;

@Profile("test")
@Configuration
public class ImportRateQuoteTestConfiguration {

	@Bean
	@Primary
	public QuoteCalculatorService quoteCalculatorService() {
		return Mockito.mock(QuoteCalculatorService.class);
	}
}
