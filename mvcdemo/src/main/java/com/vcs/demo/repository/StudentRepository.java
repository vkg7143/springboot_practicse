package com.vcs.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vcs.demo.model.Students;


public interface StudentRepository extends CrudRepository<Students,String>{

}
