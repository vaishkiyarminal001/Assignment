package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.app.model.EntryList;
import com.app.model.Response;

@RestController
public class ControllerApi {
	
	private final String API = "https://api.publicapis.org";
	
	@Autowired
	RestTemplate rt;
	
	private List<EntryList> entrylist = new ArrayList<>();
	
	@GetMapping("/api/category")
	public ResponseEntity<Response> getApiByCategory(@RequestParam String category){
		
		String url = API + "/entries";
		Response res = rt.getForObject(url, Response.class);
		return ResponseEntity.ok(res);
	}
	
	@PostMapping("/api/entries")
	public ResponseEntity<String> newEntries(@RequestParam EntryList newEntryList){
	
		
		entrylist.add(newEntryList);
		return ResponseEntity.ok("New Entry Added");
	}
}
