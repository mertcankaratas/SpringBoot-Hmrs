package com.karatasmertcan.hmrs.business.abstracts;

import java.util.List;

import com.karatasmertcan.hmrs.entities.concretes.Candicate;

public interface CandicateService {
	void Add (Candicate candicate);
	List<Candicate> getAll();
}
