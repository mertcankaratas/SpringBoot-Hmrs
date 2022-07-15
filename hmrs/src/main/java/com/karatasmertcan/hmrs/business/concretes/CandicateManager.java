package com.karatasmertcan.hmrs.business.concretes;

import java.util.List;

import com.karatasmertcan.hmrs.business.abstracts.CandicateService;
import com.karatasmertcan.hmrs.dataAccess.abstracts.CandicateDao;
import com.karatasmertcan.hmrs.entities.concretes.Candicate;

public class CandicateManager implements CandicateService {

	private CandicateDao candicateDao;
	
	
	
	public CandicateManager(CandicateDao candicateDao) {
		super();
		this.candicateDao = candicateDao;
	}

	public void Add(Candicate candicate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Candicate> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
