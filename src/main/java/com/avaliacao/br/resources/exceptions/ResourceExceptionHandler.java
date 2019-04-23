package com.avaliacao.br.resources.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.avaliacao.br.services.exceptions.ObjectNotFoundException;


@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<ObjectNotFoundException>objetoNaoEncontrado(ObjectNotFoundException e){
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e);
	}
	
}
