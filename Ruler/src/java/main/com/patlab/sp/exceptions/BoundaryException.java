package com.patlab.sp.exceptions;

import com.patlab.sp.boundary.SystemErrorType;

public class BoundaryException extends Exception {

	private static final long serialVersionUID = 1L;

	public BoundaryException(SystemErrorType type, String msg) {
		System.out.println(type.toString() + " because of this issue: " + msg);
	}
}
