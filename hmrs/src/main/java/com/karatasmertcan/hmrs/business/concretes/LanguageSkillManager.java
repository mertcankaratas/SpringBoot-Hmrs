package com.karatasmertcan.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karatasmertcan.hmrs.business.abstracts.LanguageSkillService;
import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.core.utilities.SuccessDataResult;
import com.karatasmertcan.hmrs.core.utilities.SuccessResult;
import com.karatasmertcan.hmrs.dataAccess.abstracts.LanguageSkillDao;
import com.karatasmertcan.hmrs.entities.concretes.LanguageSkill;

@Service
public class LanguageSkillManager implements LanguageSkillService{

	private LanguageSkillDao languageSkillDao;

	
	@Autowired
	public LanguageSkillManager(LanguageSkillDao languageSkillDao) {
		super();
		this.languageSkillDao = languageSkillDao;
	}

	@Override
	public Result add(LanguageSkill languageSkill) {
		
		this.languageSkillDao.save(languageSkill);
		
		return new SuccessResult("Dil bilgisi başarı ile eklendi");
	}

	@Override
	public DataResult<List<LanguageSkill>> getAll() {
		
		return new SuccessDataResult<List<LanguageSkill>>(this.languageSkillDao.findAll(),"Dil bilgileri başarı ile listelendi");
	}

	@Override
	public Result update(LanguageSkill languageSkill) {
		this.languageSkillDao.save(languageSkill);
		
		return new SuccessResult("Dil bilgisi başarı ile eklendi");
	}

}
