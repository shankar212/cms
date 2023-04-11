
package com.cmsa.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmsa.DAO.FeesDAO;
import com.cmsa.Model.FeesModel;

@Service
public class FeesService {


	@Autowired
	FeesDAO ld;
	public FeesService() {
		
	}
	
	public List<FeesModel> getAllLogin(){
		
		return ld.findAll();
	}
	
	public void saveStudent(FeesModel ll) {
		ld.save(ll);
	}

}
