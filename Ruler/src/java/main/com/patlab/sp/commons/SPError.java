package com.patlab.sp.commons;

import com.patlab.sp.cf.CFErrorType;

public interface SPError {
	public CFErrorType getErrorType();
	public String getMessage();
	public String[] getParams();
}
