package org.turcell.tcell.exception.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.turcell.tcell.exception.exceptions.details.BusinessExceptionDetails;
import org.turcell.tcell.exception.exceptions.type.BusinessException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<BusinessExceptionDetails> handleBusinessException(BusinessException exception) {
        BusinessExceptionDetails businessExceptionDetails = new BusinessExceptionDetails();
        businessExceptionDetails.setTitle(exception.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(businessExceptionDetails);
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ex.getBindingResult().getAllErrors().get(0).getDefaultMessage());
    }

}
