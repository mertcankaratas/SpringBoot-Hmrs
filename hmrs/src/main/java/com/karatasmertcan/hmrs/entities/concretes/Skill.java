package com.karatasmertcan.hmrs.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="skills")
@AllArgsConstructor
@NoArgsConstructor
 
public class Skill{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	@Column(name="id")
	private int id;
	
	@Column(name="skill_name")
	private String skillName;
	
	@OneToMany(mappedBy = "skill")
	@JsonBackReference
	private List<Resume> resumes;
}
