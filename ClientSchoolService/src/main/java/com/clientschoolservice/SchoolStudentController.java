package com.clientschoolservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SchoolStudentController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/getStudentsname/{studentname}", method = RequestMethod.GET)
	public String getStudent(@PathVariable String studentname) {
		System.out.println("Getting School details for " + studentname);

		String response = restTemplate.exchange("http://student-service/studentsname/{studentname}",
				HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
				}, studentname).getBody();
		System.out.println("Response Received as " + response);

		return "Student Name - " + studentname + "& \n Student Details " + response;
	}
	
	@RequestMapping(value = "/deleteStudentsname/{id}", method = RequestMethod.DELETE)
	public String deleteStudent(@PathVariable Long id) {
		System.out.println("Getting School details for " + id);

		String response = restTemplate.exchange("http://student-service/studentid/{id}",
				HttpMethod.DELETE, null, new ParameterizedTypeReference<String>() {
				}, id).getBody();
		System.out.println("Response Received as " + response);

		return "Student Deleted - " + id + ":" + HttpStatus.OK;
	}
	
	@RequestMapping(value = "/updateStudentDetails/{id}", method = RequestMethod.PUT)
	public String updateStudentInfo(@PathVariable Long id) {
		System.out.println("Getting School details for " + id);
		
		String response = restTemplate.exchange("http://student-service/updatestudent/{id}",
				HttpMethod.PUT, null, new ParameterizedTypeReference<String>() {
				}, id).getBody();
		System.out.println("Response Received as " + response);

		return "Student Data Updated - " + id + ":" + HttpStatus.OK;
	}
}