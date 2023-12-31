package com.example.springcore.services;

import java.util.ArrayList;
import java.util.List;

import com.example.springcore.controller.entities.Course;

public class CourseServiceImpl implements CourseService {
	List<Course> list;

	public CourseServiceImpl() {
		list =new ArrayList<>();
		list.add(new Course(145,"Java","JdK14"));
		
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	


}
