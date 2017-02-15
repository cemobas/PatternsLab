package com.patlab.sp.commons;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import com.patlab.sp.commons.SPValidator;
import com.patlab.sp.exceptions.BoundaryException;

public class SPValidatorImpl implements SPValidator {
	
	private Queue<SPRule> contract;
	
	public SPValidatorImpl() {
		this.contract = new PriorityQueue<SPRule>();
	}

	@Override
	public void registerRule(SPRule spRule) {
		this.contract.add(spRule);
	}

	@Override
	public void run() throws BoundaryException {
		for (SPRule spRule : contract) {
			if(spRule.validate()) {
				spRule.success();
			} else {
				spRule.fail();
			}
		}
	}

}
