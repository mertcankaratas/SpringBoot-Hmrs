package com.karatasmertcan.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karatasmertcan.hmrs.entities.concretes.Skill;

public interface SkillDao extends JpaRepository<Skill, Integer> {

}
