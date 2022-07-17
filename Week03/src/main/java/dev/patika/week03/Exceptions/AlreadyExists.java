package dev.patika.week03.Exceptions;

public class AlreadyExists extends RuntimeException  {

    public AlreadyExists (String M) {
        super(M);
    }
}
