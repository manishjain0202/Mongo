package com.manish.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.manish.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
// tak ethe adv if mongo db
	List<Student> findByName(String name);// dont need to write the mongo db query , Spring data  take care
	
	Student findByEmailAndName (String email, String name);
	
	Student findByNameOrEmail (String name, String email);
	
	List<Student> findByDepartmentDepartmentName(String deptname);
	
	List<Student> findBySubjectsSubjectName (String subName);
	
	List<Student> findByEmailIsLike (String email);
	
	List<Student> findByNameStartsWith (String name);
}
