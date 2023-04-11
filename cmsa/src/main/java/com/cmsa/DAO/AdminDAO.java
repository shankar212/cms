package com.cmsa.DAO;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cmsa.Model.AdminModel;

public interface AdminDAO extends JpaRepository<AdminModel,String>{

//	public StudentModel findByEmail(String email);
//
//	public StudentModel findByEmailAndPassword(String email, String password);

	Optional<AdminModel> findById(String email);

	AdminModel findByEmail(String email);

	

	



	

}
