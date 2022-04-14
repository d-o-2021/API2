package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;


@Service
public class CourseServiceimpl implements CourseService {
	
	List<Course> list;
	
	public CourseServiceimpl()
	{
		list=new ArrayList<>();
		list.add(new Course(11,"Core java","Basics of core java"));
		list.add(new Course(12,"Boot","create API"));
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	
	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c=null;
		for(Course course:list) 
		{
			if(course.getId()==courseId) 
			{
				c=course;
				break;
			}
		}
		return c ;
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
//		return null;
	}

	@Override
	public Course UpdateCourse(Course course) {
		// TODO Auto-generated method stub
		Course c=null;
		for(Course course1:list) 
		{
			if(course.getId()==course1.getId()) 
			{
				course1.setDesc(course.getDesc());
				course1.setTitle(course.getTitle());
				c=course1;
			}
		}
		return c;
	}

}
