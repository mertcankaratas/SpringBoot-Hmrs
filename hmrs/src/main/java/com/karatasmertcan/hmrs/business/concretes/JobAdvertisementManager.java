package com.karatasmertcan.hmrs.business.concretes;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karatasmertcan.hmrs.business.abstracts.JobAdvertisementService;
import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.core.utilities.SuccessDataResult;
import com.karatasmertcan.hmrs.core.utilities.SuccessResult;
import com.karatasmertcan.hmrs.dataAccess.abstracts.JobAdvertisementDao;
import com.karatasmertcan.hmrs.entities.concretes.JobAdvertisement;
import com.karatasmertcan.hmrs.entities.dtos.JobAdvertisementDto;

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
	public Result delete(JobAdvertisementDto jobAdvertisementDtot) {
		
		//this.jobAdvertisementDao.delete(jobAdvertisement);
		return new SuccessResult("İş ilanı başarı ile silindi");
	}

	@Override
	public Result update(JobAdvertisementDto jobAdvertisementDtot) {
		//this.jobAdvertisementDao.delete(jobAdvertisement);
		return new SuccessResult("İş ilanı başarı ile güncellendi");
	}
	

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(),"İş ilanları listelendi");
	}

}
