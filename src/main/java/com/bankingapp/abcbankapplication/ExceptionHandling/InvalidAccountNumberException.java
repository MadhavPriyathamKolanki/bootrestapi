package com.bankingapp.abcbankapplication.ExceptionHandling;

public class InvalidAccountNumberException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidAccountNumberException(String message){
        super(message);
    }
}
