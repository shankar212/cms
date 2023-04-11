
package com.cmsa.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cmsa.Model.BranchModel;
import com.cmsa.Service.BranchService;

@RestController
@CrossOrigin("*")
public class BranchController {
@Autowired
BranchService l;
//GET
//@RequestMapping(value="/login",method=RequestMethod.GET)
@GetMapping("viewbranch")
public List<BranchModel> getLogin() {
	
	return l.getAllLogin();

}

//POST
//@RequestMapping(value="/save",method=RequestMethod.POST)
@PostMapping("addbranch")
public void saveL(@RequestBody BranchModel ll) {
	
	l.saveStudent(ll);

}


@PostMapping("updatebranch")
public void updateL(@RequestBody BranchModel ll) {
	
	l.updateStudent(ll);

}

@PostMapping("deletebranch")
public void deleteL(@RequestBody BranchModel id) {
	
	l.deleteStudent(id);

}

}