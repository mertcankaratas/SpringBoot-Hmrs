package com.karatasmertcan.hmrs.entities.dtos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.validation.constraints.Null;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDto {


	
	private int jobAdvertisementId;

	private int jobPositionId;
	
	private int employerID;
	 
	
	private int cityId;

	
	private int workTypeId;
	
	
	
	private String jobDescription;
	

	private int workerQuantity;
	
	
	private int minSalary;
	
	
	private int maxSalary;
	
	
	private LocalDate dueDate;

	@Null (message ="must be null")
	private LocalDate releaseDate = LocalDate.now();
	
	
	private boolean state;
}
