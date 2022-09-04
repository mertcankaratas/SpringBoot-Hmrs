package com.karatasmertcan.hmrs.business.abstracts;

import java.util.List;

import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.entities.concretes.JobAdvertisement;
import com.karatasmertcan.hmrs.entities.dtos.JobAdvertisementDto;

public interface JobAdvertisementService {

	Result add(JobAdvertisementDto jobAdvertisementDto);
	Result delete(JobAdvertisementDto jobAdvertisementDto);
	Result update(JobAdvertisementDto jobAdvertisementDto);
	DataResult<List<JobAdvertisement>> getAll();
	
}
