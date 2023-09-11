package com.example.demo.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Course;

@FeignClient(name = "COURSESERVICE",url="http://localhost:8082")
public interface BookClient {
	

	@GetMapping("/getall")
	public List<Course> gettingCourse();

}
