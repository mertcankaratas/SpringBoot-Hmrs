package com.karatasmertcan.hmrs.business.concretes;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.reflect.TypeToken;
import com.karatasmertcan.hmrs.business.abstracts.JobAdvertisementService;
import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.core.utilities.SuccessDataResult;
import com.karatasmertcan.hmrs.core.utilities.SuccessResult;
import com.karatasmertcan.hmrs.dataAccess.abstracts.JobAdvertisementDao;
import com.karatasmertcan.hmrs.entities.concretes.JobAdvertisement;
import com.karatasmertcan.hmrs.entities.dtos.JobAdvertisement.JobAdvertisementDto;
import com.karatasmertcan.hmrs.entities.dtos.JobAdvertisement.JobAdvertisementGetDto;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{
	
	private JobAdvertisementDao jobAdvertisementDao;
	
	private ModelMapper modelMapper;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao,ModelMapper modelMapper) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
		this.modelMapper=modelMapper;
	}

	@Override
	public Result add(JobAdvertisementDto jobAdvertisementDto) {
		
		this.modelMapper.getConfiguration().setAmbiguityIgnored(true);
        JobAdvertisement jobAdvertisement = this.modelMapper.map(jobAdvertisementDto,JobAdvertisement.class);
        jobAdvertisement.setJobAdvertisementId(0);
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş ilanı başarı ile eklendi");
	}

	@Override
	public Result delete(JobAdvertisementDto jobAdvertisementDto) {
		
		//this.jobAdvertisementDao.delete(jobAdvertisement);
		return new SuccessResult("İş ilanı başarı ile silindi");
	}

	@Override
	public Result update(JobAdvertisementDto jobAdvertisementDto) {
		//this.jobAdvertisementDao.delete(jobAdvertisement);
		return new SuccessResult("İş ilanı başarı ile güncellendi");
	}
	

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(),"İş ilanları listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisementGetDto>> getActiveAdvertisement() {
	
		return new SuccessDataResult<List<JobAdvertisementGetDto>>(this.jobAdvertisementDao.getAllActiveDesc(),"Aktif iş ilanları listelendi");
		
	}

	@Override
	public DataResult<List<JobAdvertisementGetDto>> getActiveAdvertisementCompanyName(String companyName) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobAdvertisementGetDto>>(this.jobAdvertisementDao.getAllActiveCompany(companyName),"Aktif iş ilanları listelendi");
	}

}
