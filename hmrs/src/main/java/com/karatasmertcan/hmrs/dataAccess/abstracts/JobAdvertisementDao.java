package com.karatasmertcan.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karatasmertcan.hmrs.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

}
