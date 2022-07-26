package com.karatasmertcan.hmrs.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karatasmertcan.hmrs.business.abstracts.CandicateService;
import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
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
	public DataResult<List<Candicate>> getAll(){
		
		return this.candicateService.getAll();
	}
	
	
	@GetMapping("/getidentitynumber")
	public DataResult<Candicate> getByIdentityNumber(String identityNumber){
		
		return this.candicateService.getByIdentityNumber(identityNumber);
	}
	
	@PostMapping("/add")
	public Result addCandicate(@RequestBody Candicate candicate) {
		
		return this.candicateService.add(candicate);
	}
}
