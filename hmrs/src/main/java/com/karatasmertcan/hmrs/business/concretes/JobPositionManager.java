package com.karatasmertcan.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karatasmertcan.hmrs.business.abstracts.JobPositionService;
import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.ErrorDataResult;
import com.karatasmertcan.hmrs.core.utilities.ErrorResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.core.utilities.SuccessDataResult;
import com.karatasmertcan.hmrs.core.utilities.SuccessResult;
import com.karatasmertcan.hmrs.dataAccess.abstracts.JobPositionDao;
import com.karatasmertcan.hmrs.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>( this.jobPositionDao.findAll());
	}

	@Override
	public DataResult<JobPosition> getByJobTitle(String jobTitle) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<JobPosition>(this.jobPositionDao.findByJobTitle(jobTitle));
	}

	@Override
	public Result add(JobPosition jobPosition) {
		
		if(checkIfExitstJobPosition(jobPosition.getJobTitle())) {
			this.jobPositionDao.save(jobPosition);
			return new SuccessResult("İş pozisyonu Eklendi");
		}
		
		return new ErrorResult("İş baslıgı eklenemedi");
		
	}
	
	
	public boolean checkIfExitstJobPosition(String jobTitle) {
		
		var job= getByJobTitle(jobTitle);
		if(job.getData()==null) {
			return true;
		}
		
		return false;
	}



}
