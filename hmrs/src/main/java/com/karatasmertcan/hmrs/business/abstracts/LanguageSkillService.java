package com.karatasmertcan.hmrs.business.abstracts;

import java.util.List;

import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.entities.concretes.LanguageSkill;


public interface LanguageSkillService {

	Result add (LanguageSkill languageSkill);
	DataResult<List<LanguageSkill>> getAll();
	Result update(LanguageSkill languageSkil);
}
