package com.karatasmertcan.hmrs.core.utilities;

public class ErrorResult extends Result{

	public ErrorResult(boolean success) {
		super(false);
	}
	
	public ErrorResult(boolean success,String message) {
		super(false,message);
	}

}
