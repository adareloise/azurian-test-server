package com.azuarian.rest.exception.global;

import org.springframework.dao.DataAccessException;

@SuppressWarnings("serial")
public class DataNotFoundException extends DataAccessException {


	public DataNotFoundException(String s) {
		super(s);
	}
	
	public DataNotFoundException(String s, Throwable throwable) {
		super(s, throwable);
	}
	
}
