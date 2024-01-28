package com.springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.exception.InvalidFieldException;
import com.springboot.model.Student;

import io.micrometer.common.util.StringUtils;


@RestController
@RequestMapping("/student")
public class StudentController {
	
	@PostMapping
	public String saveStudentInformation(@RequestHeader("student-auth-key") String authorization, @RequestBody Student student) {
		if(StringUtils.isBlank(student.getLastName())) {
			throw new InvalidFieldException("Last Name is a required field");
		}
		return String.format("Authorization %s is valid, and Data is saved", authorization);
	}

}
