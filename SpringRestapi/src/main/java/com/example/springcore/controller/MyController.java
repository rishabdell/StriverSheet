package com.example.springcore.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcore.controller.entities.Course;

@RestController
public class MyController {
	
// Get the courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		
	}

}
