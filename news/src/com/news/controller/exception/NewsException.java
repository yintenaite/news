package com.news.controller.exception;

public class NewsException extends Exception {
	
	private String message;

	
	public NewsException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "NewsException [message=" + message + "]";
	}

	
	
	
}
