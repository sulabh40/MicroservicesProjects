package com.sulabh.security.springsecurityexample.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloResource {

	@GetMapping
	public String hello() {
		return "hello";
	}
	
	@PostMapping("/{id}")
	public String addId(@PathVariable("id") String id){
		return "saved id -"+id;
		
	}
}
