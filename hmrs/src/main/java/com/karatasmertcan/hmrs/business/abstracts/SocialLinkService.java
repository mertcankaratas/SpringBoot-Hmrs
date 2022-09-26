package com.karatasmertcan.hmrs.business.abstracts;

import java.util.List;

import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.entities.concretes.SocialLink;

public interface SocialLinkService {
	Result add (SocialLink socialLink);
	DataResult<List<SocialLink>> getAll();
	Result update(SocialLink socialLink);

}
