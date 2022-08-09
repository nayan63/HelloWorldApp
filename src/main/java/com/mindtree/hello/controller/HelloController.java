package com.mindtree.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("display/{name}")
	public String display(@PathVariable String name)
	{
		return "Hello "+name;
	}
	
	@GetMapping("display/{number}")
	public String display2(@PathVariable Long number)
	{
		return "Hello "+number;
	}
	
	@PostMapping("/Hello")
	public String Hello()
	{
		return "Hello";
	}
}
