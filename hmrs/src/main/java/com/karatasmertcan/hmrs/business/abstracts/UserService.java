package com.karatasmertcan.hmrs.business.abstracts;

import java.util.List;

import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.entities.concretes.JobPosition;
import com.karatasmertcan.hmrs.entities.concretes.User;

public interface UserService {
	DataResult<User> getByMail(String email);
	Result Add(User user);
	DataResult<List<User>> getAll();
	
}
