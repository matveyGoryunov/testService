package ru.nitrouz.testservice.exceptions.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.nitrouz.testservice.exceptions.PeopleNotFoundException;

@ControllerAdvice
public class PeopleNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(PeopleNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String peopleNotFoundHandler(PeopleNotFoundException ex) {
        return ex.getMessage();
    }
}
