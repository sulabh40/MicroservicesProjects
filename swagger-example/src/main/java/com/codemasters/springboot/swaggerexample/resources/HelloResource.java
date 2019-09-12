package com.codemasters.springboot.swaggerexample.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/rest/hello")
@Api(value ="User Resource Endpoint",description = "shows the user Info")
public class HelloResource {
	
	@ApiOperation("Returns Hello World!!!")
	@ApiResponses(
			value = {
			@ApiResponse(code = 100, message = "100 is the message"),
			@ApiResponse(code = 200, message = "Successfully done"),
	}
	)
	@GetMapping("/get")
	public String getHello() {
		return "Hello World!!!!!!!!!";
	}
	
	@ApiOperation("Returns Hello World!!!")
	@PostMapping("/postmsg")
	public String addMessage(@RequestBody final String msg) {
		return msg;
	}
	@ApiOperation("Returns Hello World!!!")
	@PutMapping("/putmsg")
	public String putMessage(@RequestBody final String msg) {
		return msg;
	}

}
