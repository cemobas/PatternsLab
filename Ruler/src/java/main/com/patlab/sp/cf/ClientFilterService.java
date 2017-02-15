package com.patlab.sp.cf;

import com.patlab.sp.cf.rules.SurnamesEqualityRule;
import com.patlab.sp.cf.rules.ValidIdFormatRule;
import com.patlab.sp.commons.SPValidatorImpl;
import com.patlab.sp.exceptions.BoundaryException;

public class ClientFilterService {

	public static void call(String[] surnames, String id) {
		SPValidatorImpl validator = new SPValidatorImpl();
		validator.registerRule(new SurnamesEqualityRule(1, surnames));
		validator.registerRule(new ValidIdFormatRule(2, id));
		try {
			validator.run();
		} catch (BoundaryException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
