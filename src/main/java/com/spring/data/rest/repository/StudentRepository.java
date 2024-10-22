package com.spring.data.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.spring.data.rest.entity.Student;

//@RepositoryRestResource(collectionResourceRel = "student-api", path = "student-api")
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	public List<Student> findByName(String name);
	
	public List<Student> findBySection(String section);

}
