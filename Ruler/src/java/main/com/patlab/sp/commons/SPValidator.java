package com.patlab.sp.commons;

import com.patlab.sp.exceptions.BoundaryException;

public interface SPValidator {
	public void registerRule(SPRule spRule);
	public void run() throws BoundaryException;
}
