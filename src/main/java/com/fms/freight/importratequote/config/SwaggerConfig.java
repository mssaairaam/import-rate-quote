package com.fms.freight.importratequote.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfig {
	public Docket api() { 
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.fms.freight.importratequote.quotecalc"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfoMetaData());
	}
	
	private ApiInfo apiInfoMetaData() {
	    return new ApiInfo(
	      "Import Quote Calculator API", 
	      "Calculates Total Cost of the Quote with the given weight(kg) and volume(m3).", 
	      "0.0.1", 
	      "", 
	      null, 
	      "", 
	      "", 
	      null);
	}
}
