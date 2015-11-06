package edu.javacourse.tractor.exception;

public class UnknownStateException extends TractorException
{
    public UnknownStateException(int errorCode, String message) {
        super(errorCode, message);
    }
    
}
