package com.karatasmertcan.hmrs.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Candicates")
public class Candicate {
	@Id
	@Column(name="CandicateId")
	private int candicateId;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="SurName")
	private String lastName;
	
	@Column(name="BirthDate")
	private Date  birthDate;
	
	@Column(name="IdentityNumber")
	private String identityNumber;

	
	public Candicate() {
		
	}
	
	public Candicate(int candicateId, String name, String lastName, Date birthDate, String identityNumber) {
		super();
		this.candicateId = candicateId;
		this.name = name;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.identityNumber = identityNumber;
	}
	
	
	
	
}
