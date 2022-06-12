package com.karatasmertcan.hmrs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Employers")
public class Employer {
	@Id
	@Column(name="EmployerId")
	private int employerId;
	
	@Column(name="CompanyName")
	private String companyName;
	
	@Column(name="WebPage")
	private String webPage;
	
	@Column(name="PhoneNumber")
	private String phoneNumber;
	
	public Employer() {
		
	}

	public Employer(int employerId, String companyName, String webPage, String phoneNumber) {
		super();
		this.employerId = employerId;
		this.companyName = companyName;
		this.webPage = webPage;
		this.phoneNumber = phoneNumber;
	}
	
}
