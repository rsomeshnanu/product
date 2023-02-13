package com.slokam.sec;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("hello")
	@PreAuthorize("hasRole('USER')")
	public String hello() {
		return "Hello Hi How are you?";
	}
	
	@PreAuthorize("hasRole('MANAGER')")
	@GetMapping("test1")
	
	public String test1() {
		
		//method logic
		return "Test1";
	}
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("test2")
	public String test2() {
		
		//code
		return "Test2";
	}
}
