package com.app.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response {
	
	private int count;
	private List<EntryList> entries;
	
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Response(int count, List<EntryList> entries) {
		super();
		this.count = count;
		this.entries = entries;
	}
	
	
	
	

}
