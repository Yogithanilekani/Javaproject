package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.client.BookClient;
import com.example.demo.entity.Course;

@RestController
public class BookController {
	
	@Autowired
	private BookClient bk;
	
	@GetMapping("/frombook")
	public String getMessage() {
		return "msg from Book";
	}
	
//	@Cacheable(key="yo",value=List<Course>)
	@GetMapping("/fromCourse")
	public List<Course> getCourse() {
		return bk.gettingCourse();
	}
	

}
