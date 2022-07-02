package com.amz.demo.advices;

import com.amz.demo.exceptions.AlienNotFound;
import com.amz.demo.interfaces.InternalServerError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AlienNotFoundAdvice {
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  @ExceptionHandler(AlienNotFound.class)
  public InternalServerError handleAlienNotFoundException(AlienNotFound ex) {
    return new InternalServerError(ex.getMessage());
  }
}
