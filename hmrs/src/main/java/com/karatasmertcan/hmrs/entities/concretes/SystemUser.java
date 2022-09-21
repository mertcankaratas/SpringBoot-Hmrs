package com.karatasmertcan.hmrs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.karatasmertcan.hmrs.core.entities.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="systemusers")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name="system_user_id", referencedColumnName = "id")
@EqualsAndHashCode(callSuper=false)
public class SystemUser extends User {
	
	
	@Column(name="name")
	private String name;
	
	@Column(name="sur_name")
	private String surName;

	
	
	
}
