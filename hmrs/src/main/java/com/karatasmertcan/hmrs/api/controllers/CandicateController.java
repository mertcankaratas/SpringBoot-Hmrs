package com.karatasmertcan.hmrs.api.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.karatasmertcan.hmrs.business.abstracts.CandicateService;

import com.karatasmertcan.hmrs.core.utilities.ErrorDataResult;

import com.karatasmertcan.hmrs.entities.concretes.Candicate;

@RestController
@RequestMapping("/api/candicates")
public class CandicateController {
	private CandicateService candicateService;

	@Autowired
	public CandicateController(CandicateService candicateService) {
		super();
		this.candicateService = candicateService;
	};
	
	@GetMapping("/getall")
	public ResponseEntity<?> getAll(){
		
		return ResponseEntity.ok(this.candicateService.getAll());
	}
	
	
	@GetMapping("/getidentitynumber")
	public ResponseEntity<?>  getByIdentityNumber(String identityNumber){
		
		return ResponseEntity.ok(this.candicateService.getByIdentityNumber(identityNumber));
	}
	
	@PostMapping("/add")
	public ResponseEntity<?>  addCandicate(@RequestBody Candicate candicate) {
		
		return ResponseEntity.ok(this.candicateService.add(candicate));
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
