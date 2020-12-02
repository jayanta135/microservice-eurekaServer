package com.clientstudentservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clientstudentservice.Student;
import com.clientstudentservice.model.StudentInfo;
import com.clientstudentservice.service.StudentService;

@RestController
public class StudentServiceDaoController {
	
	@Autowired
	private StudentService service;
	
	@RequestMapping(value = "/getStudentDetailsForSchool", method = RequestMethod.GET)
	public List<StudentInfo> getStudentsByName() {
		System.out.println("Getting Student details for ");

		List<StudentInfo> studentList = service.getAllStudent();
		
		return studentList;
	}

}
