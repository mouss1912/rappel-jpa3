package com.exception;

public class IntervenantException extends Exception {
	private String message;

	public IntervenantException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}
