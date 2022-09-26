package com.karatasmertcan.hmrs.business.abstracts;

import java.util.List;

import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.entities.concretes.Education;


public interface EducationService {
	Result add (Education education);
	DataResult<List<Education>> getAll();
	Result update(Education education);
	
}
