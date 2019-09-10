package com.sulabh.security.springsecurityexample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("sulabh").password("{noop}sulabh").roles("User").and()
		.withUser("anand").password("{noop}anand").roles("admin");
	}
	@Override
	public void configure(HttpSecurity httpsecurity) throws Exception {
		httpsecurity
		     .authorizeRequests()
		     .anyRequest()
		     .fullyAuthenticated()
		     .and().httpBasic();
		httpsecurity.csrf().disable();
		
	}
}
