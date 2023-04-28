package org.campus02;

public class DataFileException extends Exception{

    //nimmt message und andere exception entgegen (Exception Charging)
    public DataFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataFileException(String message) {
        super(message);
    }
}
