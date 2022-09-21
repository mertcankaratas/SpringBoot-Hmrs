package com.karatasmertcan.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karatasmertcan.hmrs.business.abstracts.UserService;
import com.karatasmertcan.hmrs.core.dataAccess.UserDao;
import com.karatasmertcan.hmrs.core.entities.User;
import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.core.utilities.SuccessDataResult;
import com.karatasmertcan.hmrs.core.utilities.SuccessResult;

@Service
public class UserManager implements UserService{
	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<User> getByMail(String email) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<User>(this.userDao.findByEmail(email),"Kullanıcı Bulundu");
	}

	@Override
	public Result Add(User user) {
			
			
		this.userDao.save(user);
		return new SuccessResult();
		
	
	}

	@Override
	public DataResult<List<User>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<User>>(this.userDao.findAll());
	}
	
	

	
	
	
}
