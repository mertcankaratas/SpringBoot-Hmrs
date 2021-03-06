package com.karatasmertcan.hmrs.business.abstracts;

import java.util.List;

import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.entities.concretes.JobPosition;

public interface JobPositionService {
	DataResult<List<JobPosition>> getAll();
	DataResult<JobPosition> getByJobTitle(String jobTitle); 
	Result add(JobPosition jobPosition);
	
	
}