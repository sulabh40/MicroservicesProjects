package com.codemasters.springboot.swaggerexample.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/user")
public class UserResource {

	@GetMapping("/users")
	public List<User> getUsers(){

		return Arrays.asList(new User("sam",5000L),
				new User("ram",9999L));

	}
	
	@PostMapping("/{userName}")
	public User getUser(@PathVariable("userName") final String userName) {
		return new User(userName,2000L);
	}

	private class User{

		private String user;
		public User(String user, Long salary) {
			super();
			this.user = user;
			this.salary = salary;
		}
		private Long salary;

	}
}
