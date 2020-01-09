package com.fms.freight.importratequote.quotecalcview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fms.freight.importratequote.domain.QuoteVariables;

@Controller
public class QuoteCalculatorViewController {
	
	@Autowired
	QuoteVariables quoteVariables;
	
	@RequestMapping(path = "/main", 
			method = RequestMethod.GET)
    public String importQuoteLandingPage() {
        return "import-quote";
    }
	
	@RequestMapping(path = "/configure", 
			method = RequestMethod.GET)
    public ModelAndView importQuoteConfigurationPage() {
		ModelAndView configurationModelViewPage = new ModelAndView("import-quote-configuration");
		configurationModelViewPage.addObject("existingQuoteVariables", quoteVariables);
        return configurationModelViewPage;
    }
}
