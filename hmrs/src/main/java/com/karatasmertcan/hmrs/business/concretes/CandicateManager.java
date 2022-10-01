package com.karatasmertcan.hmrs.business.concretes;

import java.util.List;

import javax.validation.constraints.Null;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karatasmertcan.hmrs.business.abstracts.CandicateService;
import com.karatasmertcan.hmrs.business.abstracts.UserService;
import com.karatasmertcan.hmrs.core.adapters.mernis.MernisService;
import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.ErrorResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.core.utilities.SuccessDataResult;
import com.karatasmertcan.hmrs.core.utilities.SuccessResult;
import com.karatasmertcan.hmrs.dataAccess.abstracts.CandicateDao;
import com.karatasmertcan.hmrs.entities.concretes.Candicate;
@Service
public class CandicateManager implements CandicateService {

	private CandicateDao candicateDao;
	private UserService userService;
	private MernisService mernisServiceAdapter;
	@Autowired
	public CandicateManager(CandicateDao candicateDao, UserService userSevice,MernisService mernisServiceAdapter) {
		super();
		this.candicateDao = candicateDao;
		this.userService = userSevice;
		this.mernisServiceAdapter =mernisServiceAdapter;
	}



	@Override
	public Result add(Candicate candicate) {
		if(businessRules(candicate)) {
			this.candicateDao.save(candicate);
			return new SuccessResult("Başırı ile kayıt olundu");
		}
		
		
		return new ErrorResult("Email veya Tc Kimlik numarası daha önce kullanılmıştır");
		
	}



	@Override
	public DataResult<List<Candicate>> getAll() {
		
		return new SuccessDataResult<List<Candicate>>(this.candicateDao.findAll(),"İş arayanlar listelendi");
	}

	
	
	private boolean checkCandicateIfExist(Candicate candicate) {
		
		 var mailCheck =userService.getByMail(candicate.getEmail());
		 var identityNumberCheck = getByIdentityNumber(candicate.getIdentityNumber());
		 
		 if(mailCheck.getData()==null && identityNumberCheck.getData()==null) {
			 return false;
		 }
		
		return true;
	}
	
	private boolean checkIfIdentityNumber(Candicate candicate) {
		
		if(this.mernisServiceAdapter.checkIfRealPerson(candicate.getIdentityNumber(), candicate.getName(), candicate.getLastName(), candicate.getBirthDate())) {
			return true;
		}
		
		return false;
		
	}



	@Override
	public DataResult<Candicate> getByIdentityNumber(String identityNumber) {
		
		return new SuccessDataResult<Candicate>(this.candicateDao.getByIdentityNumber(identityNumber),identityNumber+" kimlik numaralı kişi");
	}
	
	
	public boolean businessRules(Candicate candicate) {
		
		
		
		if(!checkCandicateIfExist(candicate)&& checkIfIdentityNumber(candicate)==true) {
			return true;
		}
		
		
		return false;
	}

	
}
