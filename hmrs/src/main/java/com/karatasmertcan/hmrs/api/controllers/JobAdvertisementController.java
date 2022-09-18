package com.karatasmertcan.hmrs.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.karatasmertcan.hmrs.business.abstracts.JobAdvertisementService;
import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.entities.concretes.JobAdvertisement;
import com.karatasmertcan.hmrs.entities.dtos.JobAdvertisement.JobAdvertisementDto;
import com.karatasmertcan.hmrs.entities.dtos.JobAdvertisement.JobAdvertisementGetDto;

@RestController
@RequestMapping("/api/jobadvertisement")
public class JobAdvertisementController {

	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementController(JobAdvertisementService advertisementService) {
		super();
		this.jobAdvertisementService = advertisementService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll(){
		
		return this.jobAdvertisementService.getAll();
	}
	
	@PostMapping("/add")
	public Result addJobAdvertisement(@RequestBody JobAdvertisementDto jobAdvertisementDto) {
		return this.jobAdvertisementService.add(jobAdvertisementDto);
	}
	
	@GetMapping("/getallactive")
	public DataResult<List<JobAdvertisementGetDto>> getAllActive(){
		
		return this.jobAdvertisementService.getActiveAdvertisement();
	}
	

	@GetMapping("/getallactivecompany")
	public DataResult<List<JobAdvertisementGetDto>> getAllActiveCompany(@RequestParam String companyName){
		
		return this.jobAdvertisementService.getActiveAdvertisementCompanyName(companyName);
	}

	
	
}
