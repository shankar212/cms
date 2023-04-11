package com.cmsa.DAO;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cmsa.Model.StudentModel;

public interface StudentDAO extends JpaRepository<StudentModel,Integer>{

//	public StudentModel findByEmail(String email);
//
//	public StudentModel findByEmailAndPassword(String email, String password);
//
//	Optional<StudentModel> findById(String email);
//
//	StudentModel findByEmail(String email);
	Optional<StudentModel> findById(String id);

	StudentModel findByEmail(String email);

	Optional<StudentModel> findByMobileno(String mobileno);

	
}
