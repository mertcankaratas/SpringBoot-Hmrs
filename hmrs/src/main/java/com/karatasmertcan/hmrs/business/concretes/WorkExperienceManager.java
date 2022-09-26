package com.karatasmertcan.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karatasmertcan.hmrs.business.abstracts.WorkExperienceService;
import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.core.utilities.SuccessDataResult;
import com.karatasmertcan.hmrs.core.utilities.SuccessResult;
import com.karatasmertcan.hmrs.dataAccess.abstracts.WorkExperienceDao;
import com.karatasmertcan.hmrs.entities.concretes.WorkExperience;

@Service
public class WorkExperienceManager  implements WorkExperienceService{

	private WorkExperienceDao workExperienceDao;
	
	@Autowired
	public WorkExperienceManager(WorkExperienceDao workExperienceDao) {
		super();
		this.workExperienceDao = workExperienceDao;
	}
	
	@Override
	public Result add(WorkExperience workExperience) {
		this.workExperienceDao.save(workExperience);
						
		return new SuccessResult("İş tecrübesi başarı ile eklendi");
	}

	

	@Override
	public DataResult<List<WorkExperience>> getAll() {
		
		return new SuccessDataResult<List<WorkExperience>>(this.workExperienceDao.findAll(),"İş tecrübeleri listelendi");
	}

	@Override
	public Result update(WorkExperience workExperience) {
		this.workExperienceDao.save(workExperience);
		
		return new SuccessResult("İş tecrübesi başarı ile güncellendi");
	}

}
