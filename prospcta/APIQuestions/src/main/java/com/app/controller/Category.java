package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Category {
	
	private final String API = "https://api.publicapis.org/";
	
	@Autowired
	private RestTemplate rt;
	
	@GetMapping("/category")
	public List<Entry> list(@RequestParam String category){
		
		String url = API + "/entries?category=" + category;
		APIResponse res = rt.getForObject(url, APIResponse.class);
		return res.getEntries();
	}

}
