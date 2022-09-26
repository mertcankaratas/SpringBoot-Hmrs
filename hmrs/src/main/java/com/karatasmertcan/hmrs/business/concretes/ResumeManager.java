package com.karatasmertcan.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karatasmertcan.hmrs.business.abstracts.ResumeService;
import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.core.utilities.SuccessDataResult;
import com.karatasmertcan.hmrs.core.utilities.SuccessResult;
import com.karatasmertcan.hmrs.dataAccess.abstracts.ResumeDao;
import com.karatasmertcan.hmrs.entities.concretes.Resume;

@Service
public class ResumeManager implements ResumeService{
	
	private ResumeDao resumeDao;
	
	
	@Autowired
	public ResumeManager(ResumeDao resumeDao) {
		super();
		this.resumeDao = resumeDao;
	}

	@Override
	public Result add(Resume resume) {
		this.resumeDao.save(resume);
		return new SuccessResult("CV başarı ile eklendi");
	}

	@Override
	public DataResult<List<Resume>> getAll() {
		
		return new SuccessDataResult<List<Resume>>(this.resumeDao.findAll(),"CV'ler başarı ile listelendi");
	}

	@Override
	public Result update(Resume resume) {
		this.resumeDao.save(resume);
		return new SuccessResult("CV başarı ile eklendi");
	}

}
