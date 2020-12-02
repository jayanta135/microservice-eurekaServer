
package com.clientstudentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clientstudentservice.model.StudentInfo;

@Repository
public interface StudentRepository extends JpaRepository<StudentInfo, Long> {

	StudentInfo findByName(String school);

}
