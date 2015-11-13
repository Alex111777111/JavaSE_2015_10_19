package edu.javacourse.live.exception;

public class LiveJournalException extends Exception
{

    public LiveJournalException() {
    }

    public LiveJournalException(String message) {
        super(message);
    }

    public LiveJournalException(String message, Throwable cause) {
        super(message, cause);
    }

    public LiveJournalException(Throwable cause) {
        super(cause);
    }

    public LiveJournalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
