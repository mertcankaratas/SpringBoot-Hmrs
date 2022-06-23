package com.karatasmertcan.hmrs.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="candicates")
public class Candicate {
	@Id
	@Column(name="candicate_id")
	private int candicateId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="sur_name")
	private String lastName;
	
	@Column(name="birth_date")
	private Date  birthDate;
	
	@Column(name="identity_number")
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
