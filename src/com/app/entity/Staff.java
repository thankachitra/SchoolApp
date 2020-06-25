package com.app.entity;

import com.app.common.Person;

public class Staff extends Person //This is "is a" relationship
{
	private String qualification;

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	
	
}
