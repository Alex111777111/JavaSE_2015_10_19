package edu.javacourse.live.exception;

public class LiveJournalBusinessException extends LiveJournalException
{

    public LiveJournalBusinessException() {
    }

    public LiveJournalBusinessException(String message) {
        super(message);
    }

    public LiveJournalBusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public LiveJournalBusinessException(Throwable cause) {
        super(cause);
    }

    public LiveJournalBusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
