package edu.javacourse.live.exception;

public class LiveJournalDAOException extends LiveJournalException
{

    public LiveJournalDAOException() {
    }

    public LiveJournalDAOException(String message) {
        super(message);
    }

    public LiveJournalDAOException(String message, Throwable cause) {
        super(message, cause);
    }

    public LiveJournalDAOException(Throwable cause) {
        super(cause);
    }

    public LiveJournalDAOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
