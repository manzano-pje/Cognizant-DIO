package com.pjem.pessoas.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundException extends Exception {

    public PersonNotFoundException(int id) {
        super(String.format("Person with ID %s not found!", id));
    }
}
