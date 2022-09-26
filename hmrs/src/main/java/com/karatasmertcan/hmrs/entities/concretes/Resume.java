package com.karatasmertcan.hmrs.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="resumes")
@AllArgsConstructor  
@NoArgsConstructor
public class Resume {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@OneToOne()
	@JsonManagedReference
	@JoinColumn(name="candicate_id",referencedColumnName = "candicate_id")
	private Candicate candicate;
	
	@Column(name="cover_letter")
	private String coverLetter;
	
	@OneToOne()
	@JsonManagedReference
	@JoinColumn(name="photograph_id", referencedColumnName = "id")
	private Photograph photograph;
	
	@ManyToOne()
	@JsonManagedReference
	@JoinColumn(name="work_experience_id",referencedColumnName = "id")
	private WorkExperience workExperience;
	
	@ManyToOne()
	@JsonManagedReference
	@JoinColumn(name="education_id",referencedColumnName = "id")
	private Education education;
	
	@ManyToOne()
	@JsonManagedReference
	@JoinColumn(name="skill_id",referencedColumnName = "id")
	private Skill skill;
	
	@ManyToOne()
	@JsonManagedReference
	@JoinColumn(name="language_skill_id",referencedColumnName = "id")
	private LanguageSkill languageSkill;
	
	@OneToOne()
	@JsonManagedReference
	@JoinColumn(name="social_link_id",referencedColumnName = "id")
	private SocialLink socialLink;
	
	private Date creationalDate;
	
}
