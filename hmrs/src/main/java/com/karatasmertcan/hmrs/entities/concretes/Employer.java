package com.karatasmertcan.hmrs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employers")
public class Employer {
	@Id
	@Column(name="employer_id")
	private int employerId;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_page")
	private String webPage;
	
	@Column(name="phone_number")
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
