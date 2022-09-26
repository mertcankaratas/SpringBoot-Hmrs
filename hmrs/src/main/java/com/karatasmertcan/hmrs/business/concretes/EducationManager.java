package com.karatasmertcan.hmrs.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karatasmertcan.hmrs.business.abstracts.EducationService;
import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.core.utilities.SuccessDataResult;
import com.karatasmertcan.hmrs.core.utilities.SuccessResult;
import com.karatasmertcan.hmrs.dataAccess.abstracts.EducationDao;
import com.karatasmertcan.hmrs.entities.concretes.Education;

@Service
public class EducationManager implements EducationService {

	private EducationDao educationDao;
	
	
	@Autowired
	public EducationManager(EducationDao educationDao) {
		super();
		this.educationDao = educationDao;
	}

	@Override
	public Result add(Education education) {
		educationDao.save(education);
		
		return new SuccessResult("Eğitim bilgisi başarı  ile eklendi");
	}

	@Override
	public DataResult<List<Education>> getAll() {
		
		return new SuccessDataResult<List<Education>>(this.educationDao.findAll(),"Eğitim bilgileri başarı ile listelenmiştir");
	}

	@Override
	public Result update(Education education) {
		
		this.educationDao.save(education);
		
		return new SuccessResult("Eğitim bilgisi başarı  ile güncellendi");
	}

	
}
