package com.karatasmertcan.hmrs.api.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.karatasmertcan.hmrs.business.abstracts.JobAdvertisementService;
import com.karatasmertcan.hmrs.core.utilities.ErrorDataResult;
import com.karatasmertcan.hmrs.entities.dtos.JobAdvertisement.JobAdvertisementDto;


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
	public ResponseEntity<?>  getAll(){
		
		return ResponseEntity.ok(this.jobAdvertisementService.getAll());
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> addJobAdvertisement(@RequestBody JobAdvertisementDto jobAdvertisementDto) {
		return ResponseEntity.ok(this.jobAdvertisementService.add(jobAdvertisementDto));
	}
	
	@GetMapping("/getallactive")
	public ResponseEntity<?> getAllActive(){
		
		return ResponseEntity.ok(this.jobAdvertisementService.getActiveAdvertisement());
	}
	

	@GetMapping("/getallactivecompany")
	public ResponseEntity<?> getAllActiveCompany(@RequestParam String companyName){
		
		return ResponseEntity.ok(this.jobAdvertisementService.getActiveAdvertisementCompanyName(companyName));
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions){
		Map<String,String> validationErrors = new HashMap<String,String>();
		for(FieldError fieldError:exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		
		ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors,"Doğrulama hataları");
		return errors;
	}

	
	
}
