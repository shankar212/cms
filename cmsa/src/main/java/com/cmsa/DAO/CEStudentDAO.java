
package com.cmsa.DAO;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cmsa.Model.CEStudentModel;

public interface CEStudentDAO extends JpaRepository<CEStudentModel,Integer>{

//	public StudentModel findByEmail(String email);
//
//	public StudentModel findByEmailAndPassword(String email, String password);

	Optional<CEStudentModel> findById(String email);

	CEStudentModel findByEmail(String email);

	
}
