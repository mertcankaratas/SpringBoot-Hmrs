package com.karatasmertcan.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karatasmertcan.hmrs.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{
	

}
