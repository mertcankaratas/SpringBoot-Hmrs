package com.karatasmertcan.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.karatasmertcan.hmrs.business.abstracts.EmployerService;
import com.karatasmertcan.hmrs.business.abstracts.UserService;
import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.ErrorResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.core.utilities.SuccessDataResult;
import com.karatasmertcan.hmrs.core.utilities.SuccessResult;
import com.karatasmertcan.hmrs.dataAccess.abstracts.EmployerDao;
import com.karatasmertcan.hmrs.entities.concretes.Employer;

public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	private UserService userService;
	
	
	@Autowired
	public EmployerManager(EmployerDao employerDao, UserService userService) {
		super();
		this.employerDao = employerDao;
		this.userService = userService;
	}

	@Override
	public Result add(Employer employer) {
		
		if(!checkIfEmployerExist(employer.getEmail())) {
			this.employerDao.save(employer);
			return new SuccessResult("Kayıt başarı ile yapıldı");
		}
		return new ErrorResult("Lütfen bilgilerinizi kontrol ediniz.");
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());
	}
	
	public boolean checkIfEmployerExist(String email) {
		
		if(this.userService.getByMail(email)==null) {
			return false;
		}
		return true;
	}
}
