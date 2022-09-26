package com.karatasmertcan.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karatasmertcan.hmrs.entities.concretes.LanguageSkill;

public interface LanguageSkillDao  extends JpaRepository<LanguageSkill, Integer>{

}
