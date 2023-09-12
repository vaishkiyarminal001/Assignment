package com.app.controller;

import java.util.List;

@RestController
public class Category {
	
	private final String API = "https://api.publicapis.org/";
	
	@GetMapping("/category")
	public List<Entry> list(@RequestParam String category){
		String url = API + "/?category=" + category;
		RestTemplate rt = new RestTemplate();
		APIResponse res = rt.getForObject(url, APIResponse.class);
		return res.getEntries();
	}

}
