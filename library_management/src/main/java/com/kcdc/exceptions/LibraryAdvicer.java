package com.kcdc.exceptions;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import jakarta.validation.UnexpectedTypeException;

@ControllerAdvice
public class LibraryAdvicer {
	
	
	@ExceptionHandler(NoResourceFoundException.class)
	public ResponseEntity<?> handleNoResourceFoundException(NoResourceFoundException e)
	{
		return new ResponseEntity<>(e.getMessage()+"check the url or uri once aging [it not avilable ]",HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(UnexpectedTypeException.class)
	public ResponseEntity<?> handleUnexpectedTypeException(UnexpectedTypeException e)
	{
		return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException e)
	{
	
		List<String> ls=	e.getAllErrors().stream().map(g->g.getDefaultMessage()).toList();
		return new ResponseEntity<>(ls,HttpStatus.INTERNAL_SERVER_ERROR);
	}


}
