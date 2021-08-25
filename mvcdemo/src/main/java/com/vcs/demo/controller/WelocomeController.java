package com.vcs.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcs.demo.model.Students;
import com.vcs.demo.service.StudentService;

@RestController
public class WelocomeController {

@Autowired

private StudentService studentService;
	
@GetMapping("/home")
public String message()
{
	return "Hello world";
}
@GetMapping("/allstudents")
public List<Students> getAllStudents(){
	
	return studentService.getStudentDetails();
}
}
