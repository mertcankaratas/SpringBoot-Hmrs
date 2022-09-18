package com.karatasmertcan.hmrs.entities.dtos.JobAdvertisement;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementGetDto {
	private String companyName;
	private String jobTitle;
	private int workerQuantity;
	private Date releaseDate;
	private Date dueDate;
	
	
	
}
