package com.tistory.lazyengineer;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class FirstRestController {

	@GetMapping
	public ResponseEntity<?> hello()
	{
		Map<String, String> resMap = new HashMap<String, String>();
		resMap.put("key", "value sadsd");
		
		return new ResponseEntity<>(resMap, HttpStatus.OK);
	}
	
	@GetMapping("/hh")
	public ResponseEntity<?> hello1()
	{
		Map<String, String> resMap = new HashMap<String, String>();
		resMap.put("key", "value1");
		
		return new ResponseEntity<>(resMap, HttpStatus.OK);
	}
}
