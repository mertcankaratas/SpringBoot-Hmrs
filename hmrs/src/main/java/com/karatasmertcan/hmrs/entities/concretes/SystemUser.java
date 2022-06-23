package com.karatasmertcan.hmrs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="systemusers")
public class SystemUser {
	@Id
	@Column(name="system_user_id")
	private int systemUserId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="sur_name")
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
