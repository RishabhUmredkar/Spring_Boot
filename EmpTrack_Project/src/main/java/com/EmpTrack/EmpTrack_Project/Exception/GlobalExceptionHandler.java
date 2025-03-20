package com.EmpTrack.EmpTrack_Project.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(IdNotExistException.class)
	public ResponseEntity<String> handleNotExistException(IdNotExistException ex)
	{
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleGenericExcption(Exception ex)
	{
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
