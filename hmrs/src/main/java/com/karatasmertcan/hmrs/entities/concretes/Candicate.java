package com.karatasmertcan.hmrs.entities.concretes;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.karatasmertcan.hmrs.core.entities.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="candicates")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name="candicate_id", referencedColumnName = "id")
@EqualsAndHashCode(callSuper=false)
public class Candicate extends User {
		
	@Column(name="name")
	private String name;
	
	@Column(name="sur_name")
	private String lastName;
	
	@Column(name="birth_date")
	private LocalDate birthDate;
	
	@Column(name="identity_number")
	private String identityNumber;

	
	@OneToOne(mappedBy = "candicate")
	@JsonBackReference
	private Resume resume;
	
	
	
	
	
	
}
