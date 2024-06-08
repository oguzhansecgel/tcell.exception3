package org.turkcell.tcell.exception.exceptions.type;

import org.springframework.stereotype.Component;
import org.turkcell.tcell.exception.exceptions.details.ProblemDetails;

//@Component
public class BaseBusinessException extends RuntimeException {
    public BaseBusinessException(String message) {
        super(message);
    }
}