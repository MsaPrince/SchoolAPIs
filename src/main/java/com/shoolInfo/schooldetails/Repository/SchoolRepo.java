package com.shoolInfo.schooldetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoolInfo.schooldetails.Model.SchoolModel;

public interface SchoolRepo extends JpaRepository<SchoolModel, Integer> 
{
	
}
