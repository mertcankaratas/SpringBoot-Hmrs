package com.karatasmertcan.hmrs.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.karatasmertcan.hmrs.entities.concretes.JobAdvertisement;
import com.karatasmertcan.hmrs.entities.dtos.JobAdvertisement.JobAdvertisementGetDto;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
	
	public final String queryString ="Select new com.karatasmertcan.hmrs.entities.dtos.JobAdvertisement.JobAdvertisementGetDto"
			+ "(e.companyName,jp.jobTitle,ja.workerQuantity,ja.releaseDate,ja.dueDate)"
			+ "From JobAdvertisement as ja Join ja.employer e Join ja.jobPosition as jp"
			;
	
	
	@Query(queryString+" where ja.state=true AND e.companyName=:companyName")
	List<JobAdvertisementGetDto> getAllActiveCompany(String companyName);
	
	
	@Query(queryString+" where ja.state=true ORDER BY ja.dueDate desc")
	List<JobAdvertisementGetDto> getAllActiveDesc();
}
