package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repositary.StudentRepository;

@RestController
public class Student {
	
	@Autowired
	StudentRepository studentRepo;
	
	@GetMapping("/student")
	public List<StudentEntity> getAllUser()  
	{    
		return (List<StudentEntity>) studentRepo.findAll();
		   
	}
	
	@PostMapping("/addstudents")
	public void saveStudents(@RequestBody StudentEntity studententity) {
		
		studentRepo.save(studententity);
	}

}
