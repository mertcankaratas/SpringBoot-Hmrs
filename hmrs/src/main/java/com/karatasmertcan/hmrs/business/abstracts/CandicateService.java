package com.karatasmertcan.hmrs.business.abstracts;

import java.util.List;

import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.entities.concretes.Candicate;

public interface CandicateService {
	Result add (Candicate candicate);
	DataResult<List<Candicate>> getAll();
	DataResult <Candicate> getByIdentityNumber(String identityNumber);
}
