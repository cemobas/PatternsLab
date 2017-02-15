package com.patlab.sp.commons;

import com.patlab.sp.commons.SPRule;
import com.patlab.sp.exceptions.BoundaryException;

public abstract class SPRuleImpl implements SPRule {
	
	protected SPFailStrategy failStrategy;
	protected Integer executionOrder;
	
	protected SPRuleImpl(Integer executionOrder) {
		this.executionOrder = executionOrder;
	} 

	@Override
	public boolean validate() {
		return true;
	}

	@Override
	public void success() {
		System.out.println("Success!");
	}

	@Override
	public void fail() throws BoundaryException {
		this.failStrategy.fail();
	}

	@Override
	public int compareTo(SPRule o) {
		return this.executionOrder.compareTo(o.getExecutionOrder());
	}

	public Integer getExecutionOrder() {
		return executionOrder;
	}

}
