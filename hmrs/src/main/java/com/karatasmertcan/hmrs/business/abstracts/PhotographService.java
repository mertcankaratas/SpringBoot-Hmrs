package com.karatasmertcan.hmrs.business.abstracts;

import java.util.List;

import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.entities.concretes.Photograph;


public interface PhotographService {
	Result add (Photograph photograph);
	DataResult<List<Photograph>> getAll();
	Result update(Photograph photograph);
}
