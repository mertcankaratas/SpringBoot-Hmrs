package com.karatasmertcan.hmrs.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_advertisements")
@AllArgsConstructor  
@NoArgsConstructor
public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_advertisement_id")
	private int jobAdvertisementId;

	@ManyToOne()
	@JsonIgnore
	@JoinColumn(name="job_position_id")
	private JobPosition jobPosition;
	
	@ManyToOne()
	@JsonIgnore
	@JoinColumn(name="employer_id")
	private Employer employer;
	 
	 
	@ManyToOne()
	@JsonIgnore
	@JoinColumn(name="city_id")
	private City city;
	
	@ManyToOne()
	@JoinColumn(name ="work_type_id")
	private WorkType workType;
	
	
	@Column(name = "job_description")
	private String jobDescription;
	
	@Column(name ="worker_quantity")
	private int workerQuantity;
	
	@Column(name = "min_salary")
	private int minSalary;
	
	@Column(name = "max_salary")
	private int maxSalary;
	
	@Column(name = "due_date")
	private LocalDate dueDate;

	@Column(name = "release_date")
	private LocalDate releaseDate;
	
	@Column(name = "state")
	private boolean state;

}
