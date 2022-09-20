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

import com.karatasmertcan.hmrs.business.abstracts.JobPositionService;
import com.karatasmertcan.hmrs.core.utilities.ErrorDataResult;
import com.karatasmertcan.hmrs.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionController {
	private JobPositionService jobPositionService;
	
	@Autowired
	public JobPositionController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public ResponseEntity<?> getAll(){
		return ResponseEntity.ok(this.jobPositionService.getAll());
	}
	
	
	@GetMapping("/getname")

	public ResponseEntity<?> findByName(@RequestParam(defaultValue="CEO") String jobTitle) {
		return ResponseEntity.ok(this.jobPositionService.getByJobTitle(jobTitle));
		
	}
	
	@PostMapping(value="/add")
	public ResponseEntity<?> addJobPosition(@RequestBody JobPosition jobPosition) {
		
		return ResponseEntity.ok(this.jobPositionService.add(jobPosition)); 
		
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