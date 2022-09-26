package com.karatasmertcan.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karatasmertcan.hmrs.entities.concretes.Photograph;

public interface PhotographDao extends JpaRepository<Photograph, Integer> {

}
