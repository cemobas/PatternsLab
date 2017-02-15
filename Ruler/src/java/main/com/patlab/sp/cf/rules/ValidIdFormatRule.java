package com.patlab.sp.cf.rules;

import com.patlab.sp.cf.CFError;
import com.patlab.sp.cf.CFErrorType;
import com.patlab.sp.commons.SPFailStrategy;
import com.patlab.sp.commons.SPFailType;
import com.patlab.sp.commons.SPRuleImpl;

public class ValidIdFormatRule extends SPRuleImpl {
	
	private String id;
	
	public ValidIdFormatRule(Integer executionOrder, String id) {
		super(executionOrder);
		this.failStrategy = new SPFailStrategy(new CFError(CFErrorType.INCORRECT_ID_FORMAT, id), SPFailType.INTERCEPT);
		this.id = id;
	}

	@Override
	public boolean validate() {
		if (this.id.contains("XX0")) {
			return true;
		}
		return false;
	}

}
