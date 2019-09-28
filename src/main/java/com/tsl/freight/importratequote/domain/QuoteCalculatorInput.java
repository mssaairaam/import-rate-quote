package com.tsl.freight.importratequote.domain;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Input fields for Quote Calculator.")
@JsonIgnoreProperties(ignoreUnknown = false)
public class QuoteCalculatorInput {
	
	@NotNull (message = "Weight cannot be null.")
	Double weight;
	
	@NotNull (message = "Volume cannot be null.")
	Double volume;
	
	@NotNull (message = "DestinationAirport cannot be null.")
	DestinationAirport destinationAirport;

	@ApiModelProperty (name = "weight"
			, allowEmptyValue = false
			, example = "10.00"
			, required = true
			, value = "Shipment Weight in Kg.")
	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@ApiModelProperty (name = "volume"
			, allowEmptyValue = false
			, example = "0.13"
			, required = true
			, value = "Shipment Volume in m3.")
	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}
	
	@ApiModelProperty (name = "destinationAirport"
			, allowEmptyValue = false
			, example = "SYD"
			, required = true
			, value = "Destination Airport.")
	public DestinationAirport getDestinationAirport() {
		return destinationAirport;
	}

	public void setDestinationAirport(DestinationAirport destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	
	public String toString() {
		return "Weight : " + weight + " , Volume : " + volume + " , Destination Airport : " + destinationAirport + ".";
	}
}
