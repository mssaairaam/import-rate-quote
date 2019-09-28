package com.tsl.freight.importratequote.quotecalcview;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class QuoteCalculatorViewController {
	
	@RequestMapping(path = "/main", 
			method = RequestMethod.GET)
    public String importQuoteLandingPage() {
        return "import-quote";
    }
}
