package com.myexp.rest_example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myexp.rest_example.bean.Student;
import com.myexp.rest_example.service.StudentService;

@RestController
@RequestMapping(value = "student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping
	public Student save(@RequestBody Student student) {
		return service.save(student);
	}

}
