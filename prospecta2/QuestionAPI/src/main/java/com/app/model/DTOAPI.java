package com.app.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class DTOAPI {
	
	private String title;
	private String description;
	public DTOAPI(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}
	
	

}
