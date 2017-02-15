package com.patlab.sp.commons;

import com.patlab.sp.exceptions.BoundaryException;

public class SPFailStrategy {
	
	private SPError error;
	private SPFailType failType;
	
	public SPFailStrategy(SPError error, SPFailType failType) {
		this.error = error;
		this.failType = failType;
	}

	public boolean fail() throws BoundaryException {
		switch(this.failType) {
		case INTERCEPT: throw new BoundaryException(this.error.getErrorType().getSysErrorType(), String.format(this.error.getMessage(), this.error.getParams()));
		case WARN_AND_GO: {
			System.out.println(String.format(this.error.getMessage(), this.error.getParams()));
			return true;
		}
		default: throw new IllegalArgumentException();
		}
		
	}
}
