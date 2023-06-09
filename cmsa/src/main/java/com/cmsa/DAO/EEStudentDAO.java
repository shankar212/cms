
package com.cmsa.DAO;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cmsa.Model.EEStudentModel;

public interface EEStudentDAO extends JpaRepository<EEStudentModel,Integer>{

//	public StudentModel findByEmail(String email);
//
//	public StudentModel findByEmailAndPassword(String email, String password);

	Optional<EEStudentModel> findById(String email);

	EEStudentModel findByEmail(String email);

	
}
