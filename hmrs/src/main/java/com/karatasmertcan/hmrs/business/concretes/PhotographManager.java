package com.karatasmertcan.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karatasmertcan.hmrs.business.abstracts.PhotographService;
import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.core.utilities.SuccessDataResult;
import com.karatasmertcan.hmrs.core.utilities.SuccessResult;
import com.karatasmertcan.hmrs.dataAccess.abstracts.PhotographDao;
import com.karatasmertcan.hmrs.entities.concretes.Photograph;

@Service
public class PhotographManager implements PhotographService {

	private PhotographDao photographDao;
	
	
	@Autowired
	public PhotographManager(PhotographDao photographDao) {
		super();
		this.photographDao = photographDao;
	}

	@Override
	public Result add(Photograph photograph) {
		this.photographDao.save(photograph);
		
		return new SuccessResult("Fotoğraf başarı ile eklendi");
	}

	@Override
	public DataResult<List<Photograph>> getAll() {
		
		return new SuccessDataResult<List<Photograph>>(this.photographDao.findAll(),"fotoğraflar listelendi");
	}

	@Override
	public Result update(Photograph photograph) {
		this.photographDao.save(photograph);
		
		return new SuccessResult("Fotoğraf başarı ile güncellendi");
	}

}
