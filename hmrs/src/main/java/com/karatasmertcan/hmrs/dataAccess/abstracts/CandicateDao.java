package com.karatasmertcan.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karatasmertcan.hmrs.entities.concretes.Candicate;

public interface CandicateDao extends JpaRepository<Candicate, Integer> {

	Candicate getByIdentityNumber(String identityNumber);
}
