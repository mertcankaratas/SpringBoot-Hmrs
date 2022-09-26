package com.karatasmertcan.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karatasmertcan.hmrs.business.abstracts.SkillService;
import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.core.utilities.SuccessDataResult;
import com.karatasmertcan.hmrs.core.utilities.SuccessResult;
import com.karatasmertcan.hmrs.dataAccess.abstracts.SkillDao;
import com.karatasmertcan.hmrs.entities.concretes.Skill;

@Service
public class SkillManager implements SkillService {

	private SkillDao skillDao;
	
	@Autowired
	public SkillManager(SkillDao skillDao) {
		super();
		this.skillDao = skillDao;
	}

	@Override
	public Result add(Skill skill) {
		this.skillDao.save(skill);
		return new SuccessResult("Yetenek başarı ile eklendi");
	}

	@Override
	public DataResult<List<Skill>> getAll() {

		return new SuccessDataResult<List<Skill>>(this.skillDao.findAll(),"Yetenekler başarı ile listelendi");
	}

	@Override
	public Result update(Skill skill) {
		this.skillDao.save(skill);
		return new SuccessResult("Yetenek başarı ile güncellendi");
	}

}
