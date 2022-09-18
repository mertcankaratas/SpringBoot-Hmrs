package com.karatasmertcan.hmrs.entities.dtos.JobAdvertisement;


import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.Null;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDto {


	
	

	private int jobPositionId;
	
	private int employerId;
	 
	
	private int cityId;

	
	private int workTypeId;
	
	
	
	private String jobDescription;
	

	private int workerQuantity;
	
	
	private int minSalary;
	
	
	private int maxSalary;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-DD")
	private Date dueDate;

	@Null (message ="must be null")
	private Date releaseDate =new Date(System.currentTimeMillis());
	
	
	private boolean state;
}
