
package com.cmsa.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cmsa.DAO.StaffDAO;
import com.cmsa.Model.StaffModel;
import com.cmsa.Service.StaffService;

@RestController
@CrossOrigin("*")
public class StaffController {
@Autowired
StaffService l;
//GET
//@RequestMapping(value="/login",method=RequestMethod.GET)
@GetMapping("viewstaff")
public List<StaffModel> getLogin() {
	
	return l.getAllLogin();

}

@PostMapping("viewstaffI")
public StaffModel getStaff(@RequestBody StaffModel id) {
	String id1=id.getEmail();
	return l.getStaffById(id1);
}

//POST
//@RequestMapping(value="/save",method=RequestMethod.POST)
@PostMapping("addstaff")
public void saveL(@RequestBody StaffModel ll) {
	
	l.saveStaff(ll);

}


@PostMapping("updatestaff")
public void updateL(@RequestBody StaffModel ll) {
	
	l.updateStaff(ll);

}

@PostMapping("deletestaff")
public void deleteL(@RequestBody StaffModel id) {
	
	l.deleteStaff(id);

}

@Autowired
private StaffDAO gDOA;
@PostMapping("loginstaff")
@CrossOrigin("*")
public ResponseEntity<?>loginUser(@RequestBody StaffModel userData){
	StaffModel user=gDOA.findByEmail(userData.getEmail());
	System.out.println(user);
	if(user.getPassword().equals(userData.getPassword()))
		return ResponseEntity.ok(user);
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	}
	



//@PostMapping("insert")
//@CrossOrigin(origins="http://localhost:4200")
//public void save(@RequestBody StudentModel ll)throws Exception {
//	String tempEmailId=ll.getEmailid();
//	if(tempEmailId != null && !"".equals(tempEmailId)) {
//		StudentModel llobj=l.fetchUserByEmail(tempEmailId);
//		if(llobj !=null) {
//			throw new Exception("user with"+tempEmailId+"already exist");
//		}
//	}
//	
//	l.saveUser(ll);
//
//}


}
