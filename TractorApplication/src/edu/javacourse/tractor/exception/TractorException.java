package edu.javacourse.tractor.exception;

public class TractorException extends Exception
{
    private int errorCode;

    public TractorException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

}
