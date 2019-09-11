package com.codemasters.springboot.swaggerexample.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloResource {
	
	@GetMapping("/get")
	public String getHello() {
		return "Hello Sam";
	}
	
	@PostMapping("/postmsg")
	public String addMessage(@RequestBody final String msg) {
		return msg;
	}
	
	@PutMapping("/putmsg")
	public String putMessage(@RequestBody final String msg) {
		return msg;
	}

}
