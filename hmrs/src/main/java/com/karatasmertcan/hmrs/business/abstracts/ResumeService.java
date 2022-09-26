package com.karatasmertcan.hmrs.business.abstracts;

import java.util.List;

import com.karatasmertcan.hmrs.core.utilities.DataResult;
import com.karatasmertcan.hmrs.core.utilities.Result;
import com.karatasmertcan.hmrs.entities.concretes.Resume;

public interface ResumeService {
	Result add (Resume resume);
	DataResult<List<Resume>> getAll();
	Result update(Resume resume);

}
