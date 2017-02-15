package com.patlab.sp.cf.rules;

import com.patlab.sp.cf.CFError;
import com.patlab.sp.cf.CFErrorType;
import com.patlab.sp.commons.SPFailStrategy;
import com.patlab.sp.commons.SPFailType;
import com.patlab.sp.commons.SPRuleImpl;

public class SurnamesEqualityRule extends SPRuleImpl {

	private String[] surnames;

	public SurnamesEqualityRule(Integer executionOrder, String... surnames) {
		super(executionOrder);
		super.failStrategy = new SPFailStrategy(
				new CFError(CFErrorType.SURNAMES_NOT_EQUAL, surnames),
				SPFailType.WARN_AND_GO);
		this.surnames = surnames;
	}

	@Override
	public boolean validate() {
		if (isParamsEqual(surnames)) {
			return true;
		}
		return false;
	}

	private <T> boolean isParamsEqual(T... params) {
		T current = null;
		for (T param : params) {
			if (current != null && !param.equals(current)) {
				return false;
			}
			current = param;
		}
		return true;
	}

}
