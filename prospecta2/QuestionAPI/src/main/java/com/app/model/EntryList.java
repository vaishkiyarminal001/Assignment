package com.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntryList {
	
	@JsonProperty(value="API")
	String API;
	
	@JsonProperty(value="Description")
	String Description;
	
	
	@JsonProperty(value="Auth")
	String Auth;
	
	@JsonProperty(value="Cors")
	String Cors;
	
	@JsonProperty(value="Category")
	String Category;
	
	
	

}
