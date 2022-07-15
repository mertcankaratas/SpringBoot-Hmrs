package com.karatasmertcan.hmrs.entities.concretes;

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
@Table(name="systemusers")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class SystemUser extends User {
	@Id
	@Column(name="system_user_id")
	private int systemUserId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="sur_name")
	private String surName;

	
	
	
}
