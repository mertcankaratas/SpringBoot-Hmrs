package com.karatasmertcan.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karatasmertcan.hmrs.business.abstracts.JobPositionService;
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
	public List<JobPosition> getAll() {
		return this.jobPositionDao.findAll();
	}

	@Override
	public List<JobPosition> getByJobTitle(String jobTitle) {
		// TODO Auto-generated method stub
		return this.jobPositionDao.findByJobTitle(jobTitle);
	}

	@Override
	public void Add(JobPosition jobPosition) {
		// TODO Auto-generated method stub
		
	}



}
