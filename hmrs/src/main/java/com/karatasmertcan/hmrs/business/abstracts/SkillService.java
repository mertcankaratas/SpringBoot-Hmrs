package com.karatasmertcan.hmrs.business.abstracts;

import java.util.List;

import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.entities.concretes.Skill;


public interface SkillService {
	Result add (Skill skill);
	DataResult<List<Skill>> getAll();
	Result update(Skill skill);
}
