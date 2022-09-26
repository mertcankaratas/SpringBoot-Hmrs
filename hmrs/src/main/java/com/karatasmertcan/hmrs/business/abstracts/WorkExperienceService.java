package com.karatasmertcan.hmrs.business.abstracts;

import java.util.List;

import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.entities.concretes.WorkExperience;


public interface WorkExperienceService {

	Result add (WorkExperience workExperience);
	DataResult<List<WorkExperience>> getAll();
	Result update(WorkExperience workExperience);
}
