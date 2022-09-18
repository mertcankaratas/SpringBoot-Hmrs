package com.karatasmertcan.hmrs.entities.concretes;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
	@JsonManagedReference
	@JoinColumn(name="job_position_id")
	private JobPosition jobPosition;
	
	@ManyToOne()
	@JsonManagedReference
	@JoinColumn(name="employer_id")
	private Employer employer;
	 
	 
	@ManyToOne()
	@JsonManagedReference
	@JoinColumn(name="city_id")
	private City city;
	
	@ManyToOne()
	@JsonManagedReference
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

	@Column(name = "release_date")
	private Date releaseDate;

	@Column(name = "due_date")
	private Date dueDate;


	
	@Column(name = "state")
	private boolean state;

}
