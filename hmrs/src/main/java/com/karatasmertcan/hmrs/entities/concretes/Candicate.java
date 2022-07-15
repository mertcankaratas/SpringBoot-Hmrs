package com.karatasmertcan.hmrs.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="candicates")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class Candicate extends User {
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

	
	
	
	
	
	
}
