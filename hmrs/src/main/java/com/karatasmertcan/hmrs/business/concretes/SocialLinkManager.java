package com.karatasmertcan.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karatasmertcan.hmrs.business.abstracts.SocialLinkService;
import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.core.utilities.SuccessDataResult;
import com.karatasmertcan.hmrs.core.utilities.SuccessResult;
import com.karatasmertcan.hmrs.dataAccess.abstracts.SocialLinkDao;
import com.karatasmertcan.hmrs.entities.concretes.SocialLink;

@Service
public class SocialLinkManager implements SocialLinkService {

	
	private SocialLinkDao socialLinkDao;
	
	
	@Autowired
	public SocialLinkManager(SocialLinkDao socialLinkDao) {
		super();
		this.socialLinkDao = socialLinkDao;
	}

	@Override
	public Result add(SocialLink socialLink) {
		this.socialLinkDao.save(socialLink);
		
		return new SuccessResult("Sosyal hesaplar başarı ile eklendi");
	
	}

	@Override
	public DataResult<List<SocialLink>> getAll() {
		
		return new SuccessDataResult<List<SocialLink>>(this.socialLinkDao.findAll(),"Sosyal hesaplar başarı ile listelendi");
	}

	@Override
	public Result update(SocialLink socialLink) {
		this.socialLinkDao.save(socialLink);
		
		return new SuccessResult("Sosyal hesaplar başarı ile güncellendi");
	}

}
