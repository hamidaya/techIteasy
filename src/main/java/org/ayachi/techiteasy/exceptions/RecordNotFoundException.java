package org.ayachi.techiteasy.exceptions;
// Deze klasse vormt onze custom exception

public class RecordNotFoundException extends RuntimeException {

    // Make an exception with a message
    public RecordNotFoundException(String message) {
        super(message);
    }

    // Make a default exception
    public RecordNotFoundException() {
        super();
    }

}

