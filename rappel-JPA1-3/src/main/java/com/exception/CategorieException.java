package com.exception;

public class CategorieException extends Exception {
private String message;

public CategorieException(String message) {
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
