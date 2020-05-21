package ru.nitrouz.testservice.exceptions;

public class PeopleNotFoundException extends RuntimeException {
    public PeopleNotFoundException(Long id) {
            super("Could not find somebody with id: " + id);
    }
}
