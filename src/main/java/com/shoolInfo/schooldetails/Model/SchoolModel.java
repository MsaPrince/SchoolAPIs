package com.shoolInfo.schooldetails.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="schooldetails")
public class SchoolModel {
	
	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer school_id;
	
	@Column
	private String school_name;
	
	@Column
	private String principal;
	
	@Column
	private String deputy_principal;
	
	@Column
	private Integer number_of_teachers;

	public Integer getSchool_id() {
		return school_id;
	}

	public void setSchool_id(Integer school_id) {
		this.school_id = school_id;
	}

	public String getSchool_name() {
		return school_name;
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getDeputy_principal() {
		return deputy_principal;
	}

	public void setDeputy_principal(String deputy_principal) {
		this.deputy_principal = deputy_principal;
	}

	public Integer getNumber_of_teachers() {
		return number_of_teachers;
	}

	public void setNumber_of_teachers(Integer number_of_teachers) {
		this.number_of_teachers = number_of_teachers;
	}
	
	
}
