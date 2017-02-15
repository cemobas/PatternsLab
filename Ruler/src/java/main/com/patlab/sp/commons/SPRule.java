package com.patlab.sp.commons;

import com.patlab.sp.exceptions.BoundaryException;

public interface SPRule extends Comparable<SPRule> {
	
	public boolean validate();
	public void success();
	public void fail() throws BoundaryException;
	public Integer getExecutionOrder();

}