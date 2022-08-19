package com.azuarian.rest.exception.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.azuarian.rest.exception.ExceptionResponse;
import com.azuarian.rest.exception.global.DataNotFoundException;

@RestControllerAdvice
public class CustomizedResponseEntityExceptionHandler {
	
	
	/**
     * Data not found error exception.
     *
     * @param ex, request
     * @return
     */
	@ExceptionHandler(DataNotFoundException.class)
	public final ResponseEntity<Object> dataNotFoundException(Exception ex, WebRequest request ){
		ExceptionResponse exceptionResponse = new ExceptionResponse(
						new Date(), 
						ex.getMessage(), 
						request.getDescription(false));
		
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.NOT_FOUND);
	
	}
	
}
