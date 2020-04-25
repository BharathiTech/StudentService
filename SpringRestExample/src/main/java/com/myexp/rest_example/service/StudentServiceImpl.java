package com.myexp.rest_example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myexp.rest_example.bean.Student;
import com.myexp.rest_example.repository.StudentRespository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRespository respository;

	public Student save(Student student) {
		
		return respository.save(student);
	}

}
