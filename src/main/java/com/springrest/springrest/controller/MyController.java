package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {

//	@Autowired
//	private CourseServiceimpl courseService; 
	@Autowired	
	private CourseService Courseservice;
	
	//test
	@GetMapping("/hello")
	public String sayHello() 
	{
		return "hello from maven";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.Courseservice.getCourses();
		
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) 
	{
		return this.Courseservice.getCourse(Long.parseLong(courseId));
	}
	
	
	@PostMapping("/courses") 
	public Course addCourse(@RequestBody Course course) 
	{
		return this.Courseservice.addCourse(course);
	}
	
	@PostMapping("/courses/{courseid}")
	public Course UpdateCourse(@RequestBody Course course) 
	{
		return this.Courseservice.UpdateCourse(course);
	}
	
	
}
