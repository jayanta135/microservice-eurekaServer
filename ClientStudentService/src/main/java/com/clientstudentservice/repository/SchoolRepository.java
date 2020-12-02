package com.clientstudentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.clientstudentservice.model.SchoolInfo;

@Repository
public interface SchoolRepository extends JpaRepository<SchoolInfo, Long> {

	@Query("SELECT s FROM SchoolInfo s WHERE s.schoolName = :schoolname")
	SchoolInfo findByName(String schoolname);
}
