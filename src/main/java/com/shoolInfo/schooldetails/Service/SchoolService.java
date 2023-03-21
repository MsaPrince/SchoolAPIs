package com.shoolInfo.schooldetails.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.shoolInfo.schooldetails.Model.SchoolModel;
import com.shoolInfo.schooldetails.Repository.SchoolRepo;

@Service
public class SchoolService 
{
	@Autowired
	SchoolRepo repo;
	
	public List<SchoolModel> getShoolInfo()
	{
		return repo.findAll();
	}
	
	public SchoolModel getSchoolInfoById(Integer id) {
		Optional<SchoolModel> mod = repo.findById(id);
		if(mod.isPresent()) {
			return mod.get();
		}
		throw new RuntimeException("Id " + id + " not found");
	}
	
	public SchoolModel saveSchoolInfo(SchoolModel model) {
		return repo.save(model);
	}
	
	public SchoolModel updateSchoolInfo(SchoolModel model) {
		return repo.save(model);
	}
	
	public void deleteSchoolInfo(Integer id) {
		  repo.deleteById(id);
	}
}
