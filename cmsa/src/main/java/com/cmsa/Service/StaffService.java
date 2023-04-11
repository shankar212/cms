
package com.cmsa.Service;

import java.util.List;
import java.util.Optional;
import java.lang.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmsa.DAO.StaffDAO;
import com.cmsa.Model.StaffModel;

@Service
public class StaffService {


	@Autowired
	StaffDAO ld;
	public StaffService() {
		
	}
	
	public List<StaffModel> getAllLogin(){
		
		return ld.findAll();
	}
	
	public void saveStaff(StaffModel ll) {
		ld.save(ll);
	}

	public void updateStaff(StaffModel ll1) {
		ld.save(ll1);
		
	}

	/*public void deleteStudentById(int id) {
		StudentModel ss=sd.getOne(id);
		sd.delete(ss);
	}*/
	
	public void deleteStaff(StaffModel id) {
		ld.delete(id);
		
	}
	
	public StaffModel getStaffById(String email) {
		Optional<StaffModel> pm=ld.findById(email);
		if(pm.isPresent()) {
			//System.out.println(pm.get().getName());
			return pm.get();
		}else 
		return null;
		 
	}

	public void saveUser(StaffModel ll) {
		// TODO Auto-generated method stub
		ld.save(ll);
		
	}

//	public StudentModel fetchUserByEmail(String email) {
//		// TODO Auto-generated method stub
//		return ld.findByEmail(email);
//	}	
//	
//	public StudentModel fetchUserByEmailAndPassword(String email,String password) {
//		// TODO Auto-generated method stub
//		return ld.findByEmailAndPassword(email,password);
//	}

}
