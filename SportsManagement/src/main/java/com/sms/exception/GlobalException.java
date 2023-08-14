package com.sms.exception;
import org.springframework.http.HttpStatus;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;



public class GlobalException {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> resourceNotFoundHandling(ResourceNotFoundException exception,
			WebRequest request)
	{
		GlobalException errorDetails = new GlobalException();
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}
}






