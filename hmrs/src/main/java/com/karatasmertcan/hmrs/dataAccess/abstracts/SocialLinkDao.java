package com.karatasmertcan.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karatasmertcan.hmrs.entities.concretes.SocialLink;

public interface SocialLinkDao extends JpaRepository<SocialLink, Integer>{

}
