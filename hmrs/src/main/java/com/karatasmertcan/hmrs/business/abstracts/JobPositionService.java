package com.karatasmertcan.hmrs.business.abstracts;

import java.util.List;

import com.karatasmertcan.hmrs.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
