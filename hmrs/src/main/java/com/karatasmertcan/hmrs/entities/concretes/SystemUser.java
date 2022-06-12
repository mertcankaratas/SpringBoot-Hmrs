package com.karatasmertcan.hmrs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="SystemUsers")
public class SystemUser {
	@Id
	@Column(name="SystemUserId")
	private int systemUserId;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="SurName")
	private String surName;

	public SystemUser() {
		
	}
	public SystemUser(int systemUserId, String name, String surName) {
		super();
		this.systemUserId = systemUserId;
		this.name = name;
		this.surName = surName;
	}
	
	
}
