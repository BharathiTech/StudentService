package com.myexp.rest_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myexp.rest_example.bean.Student;

@Repository
public interface StudentRespository extends JpaRepository<Student, Integer>{

}
