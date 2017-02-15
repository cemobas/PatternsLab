package com.patlab.sp.boundary;

public enum SystemErrorType {
	INTERNAL_ERROR, INVALID_CLIENT, INVALID_INPUT;
	
	@Override
	public String toString() {
		switch(this) {
		case INTERNAL_ERROR: return "Internal error";
		case INVALID_CLIENT: return "Client validation failed";
		case INVALID_INPUT: return "Input validation failed";
		default: throw new IllegalArgumentException();
		}
	};
}
