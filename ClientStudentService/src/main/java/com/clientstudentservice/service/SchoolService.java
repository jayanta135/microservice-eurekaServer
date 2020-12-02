package com.clientstudentservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clientstudentservice.model.SchoolInfo;
import com.clientstudentservice.repository.SchoolRepository;

@Service
public class SchoolService {
	
	@Autowired
	private SchoolRepository repo;
	
	
	public Optional<SchoolInfo> findByUserId(long id) {
		return repo.findById(id);
	}

	public SchoolInfo findBySchoolName(String schoolname) {
		return repo.findByName(schoolname);
	}

}
