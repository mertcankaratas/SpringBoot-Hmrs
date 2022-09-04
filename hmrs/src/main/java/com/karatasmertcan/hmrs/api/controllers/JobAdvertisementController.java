package com.karatasmertcan.hmrs.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karatasmertcan.hmrs.business.abstracts.JobAdvertisementService;
import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.entities.concretes.JobAdvertisement;
import com.karatasmertcan.hmrs.entities.dtos.JobAdvertisementDto;

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
	public Result addJobAdvertisement(JobAdvertisementDto jobAdvertisementDto) {
		return this.jobAdvertisementService.add(jobAdvertisementDto);
	}
	

	
	
}
