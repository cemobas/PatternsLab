package com.patlab.sp.cf;

import com.patlab.sp.boundary.SystemErrorType;
import com.patlab.sp.commons.SPErrorType;

public enum CFErrorType implements SPErrorType {
	COUPONS_DONT_MATCH(SystemErrorType.INVALID_CLIENT), SURNAMES_NOT_EQUAL(SystemErrorType.INVALID_INPUT), INCORRECT_ID_FORMAT(SystemErrorType.INVALID_CLIENT), UNEXPECTED_BLANK_FIELD(SystemErrorType.INTERNAL_ERROR);
	
	private SystemErrorType sysErrorType;
	
	CFErrorType(SystemErrorType sysErrorType) {
		this.sysErrorType = sysErrorType;
	}
	
	public SystemErrorType getSysErrorType() {
		return this.sysErrorType;
	}
}
