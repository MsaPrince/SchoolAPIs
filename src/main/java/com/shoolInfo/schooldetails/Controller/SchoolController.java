package com.shoolInfo.schooldetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoolInfo.schooldetails.Model.SchoolModel;
import com.shoolInfo.schooldetails.Service.SchoolService;

@RestController
public class SchoolController
{
	@Autowired
	SchoolService service;
	
	@GetMapping("/schoolInfo")
	public List<SchoolModel> getSchoolInfo(){
		return service.getShoolInfo();
	}
	
	@GetMapping("/schoolInfo/{id}")
	public SchoolModel getSchoolInfoById(@PathVariable Integer id) {
		return service.getSchoolInfoById(id);
	}
	
	@PostMapping("/schoolInfo")
	public SchoolModel saveSchoolInfo(@RequestBody SchoolModel model) {
		return service.saveSchoolInfo(model);
	}
	
	@PutMapping("/schoolInfo/{id}")
	public SchoolModel updateInfo( @PathVariable Integer id, @RequestBody SchoolModel model){
		model.setSchool_id(id);
		return service.updateSchoolInfo(model);
	}
	
	@DeleteMapping("/schoolInfo/{id}")
	public void deleteById(@PathVariable Integer id) 
	{
		 service.deleteSchoolInfo(id);
	}
	
}
