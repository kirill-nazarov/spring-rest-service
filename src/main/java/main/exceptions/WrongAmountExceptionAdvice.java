package main.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class WrongAmountExceptionAdvice {

    @ResponseBody
    @ExceptionHandler(WrongAmountException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String wrongAmountExceptionHandler(WrongAmountException ex) {
        return ex.getMessage();
    }
}
