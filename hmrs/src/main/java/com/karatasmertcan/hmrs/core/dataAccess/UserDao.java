package com.karatasmertcan.hmrs.core.dataAccess;


import org.springframework.data.jpa.repository.JpaRepository;

import com.karatasmertcan.hmrs.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {
	
	User findByEmail(String email);
}
