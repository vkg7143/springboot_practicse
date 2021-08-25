package com.vcs.demo.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcs.demo.model.Students;
import com.vcs.demo.repository.StudentRepository;

@Service
public class StudentService {

@Autowired 
private StudentRepository studentRepository;



public List<Students>  getStudentDetails()
{
	List<Students> sList =new ArrayList<Students>();
	sList=(List<Students>) studentRepository.findAll();
	
	
 return sList;
}

}
