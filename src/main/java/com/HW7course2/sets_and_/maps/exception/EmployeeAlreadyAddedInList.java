package com.HW7course2.sets_and_.maps.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class EmployeeAlreadyAddedInList extends  RuntimeException{
    public EmployeeAlreadyAddedInList(String message) {
        super(message);
    }
}
