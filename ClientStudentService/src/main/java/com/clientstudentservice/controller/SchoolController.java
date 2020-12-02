package com.clientstudentservice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clientstudentservice.Student;
import com.clientstudentservice.model.SchoolInfo;
import com.clientstudentservice.model.StudentInfo;
import com.clientstudentservice.repository.SchoolRepository;
import com.clientstudentservice.service.SchoolService;

@RestController
public class SchoolController {
	
	@Autowired
	private SchoolService service;
	
	@Autowired
	private SchoolRepository schoolRepo;
	
	@GetMapping("/users/{id}")
	public Optional<SchoolInfo> getUserById(@PathVariable("id") int id) {
		return service.findByUserId(id);
	}
	
	@GetMapping("/user/{username}")
	public SchoolInfo getUserByName(@PathVariable("username") String schoolname) {
		
		return service.findBySchoolName(schoolname);
	}

	@RequestMapping(value = "/getStudentsSchool/{schoolname}", method = RequestMethod.GET)
	public List<StudentInfo> getStudentsDetails(@PathVariable String schoolname) {
		System.out.println("Getting Student details for " + schoolname);

		List<StudentInfo> studentList = (List<StudentInfo>) schoolRepo.findByName(schoolname);
		if (studentList == null) {
			StudentInfo std = new StudentInfo("Not Found", "N/A");
		}
		return studentList;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {

		return "Welcome To Index Page";
	}


}
