package com.exception;

public class AdresseException extends Exception {
	private String message;

	public AdresseException(String message) {
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
