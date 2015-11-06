package edu.javacourse.tractor.exception;

public class NoHoleException extends TractorException
{
    public NoHoleException() {
        super(1, "Нет лунки");
    }
}
