
package com.cmsa.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cmsa.Model.FeesModel;
import com.cmsa.Service.FeesService;

@RestController
@CrossOrigin("*")
public class FeesController {
@Autowired
FeesService l;
//GET
//@RequestMapping(value="/login",method=RequestMethod.GET)
@GetMapping("viewfees")
public List<FeesModel> getLogin() {
	
	return l.getAllLogin();

}

//@PostMapping("view")
//public FeesModel getStudent(@RequestBody FeesModel id) {
//	String id1=id.getEmail();
//	return l.getStudentById(id1);
//}

//POST
//@RequestMapping(value="/save",method=RequestMethod.POST)
@PostMapping("addfees")
public void saveL(@RequestBody FeesModel ll) {
	
	l.saveStudent(ll);

}


}
