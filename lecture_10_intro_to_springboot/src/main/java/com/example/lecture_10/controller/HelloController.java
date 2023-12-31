package com.example.lecture_10.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	

	@RequestMapping("/")
	public String printHello() {
		return "Hello World";

	}
	
	@RequestMapping("/message/{name}")
	public String printName(@PathVariable String name) {
		
		return "Hello " + name;
	}

	@RequestMapping("/title")
	public String printNameWithParam(@RequestParam String name) {
		
		return "Hello " + name;
	}
	@PostMapping("/post")
	public Student createStudent(@RequestBody Student student) {
		
		return student;
	}
}
