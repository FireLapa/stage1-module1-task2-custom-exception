package com.epam.mjc;

public class CantFindStudentException extends IllegalArgumentException {
    public CantFindStudentException(String description) {
        super (description);
    }
}
