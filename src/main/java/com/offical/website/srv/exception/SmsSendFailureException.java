package com.offical.website.srv.exception;

public class SmsSendFailureException extends Exception {

	private static final long serialVersionUID = 3899974697524239454L;

	public SmsSendFailureException() {
		super();
	}

	public SmsSendFailureException(String msg) {
		super(msg);
	}
}
