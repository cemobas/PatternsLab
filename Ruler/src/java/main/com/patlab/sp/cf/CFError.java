package com.patlab.sp.cf;

import com.patlab.sp.commons.SPError;

public class CFError implements SPError {
	
	private CFErrorType errorType;
	private String[] params;

	public CFError(CFErrorType errorType, String... params) {
		this.errorType = errorType;
		this.params = params;
	}

	public String getMessage(){
		switch(this.errorType) {
		case COUPONS_DONT_MATCH: return "Coupouns on tickets don't match.";
		case SURNAMES_NOT_EQUAL: return "Surnames must be equal: %s, %s, %s";
		case INCORRECT_ID_FORMAT: return "ID '%s' has incorrect format.";
		default: throw new IllegalArgumentException();
		}
	};

	public CFErrorType getErrorType() {
		return errorType;
	}
	
	public String[] getParams() {
		return this.params;
	}
}
