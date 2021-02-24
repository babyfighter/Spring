package com.bjpowernode.exception;

//throw exception when age input error
public class AgeException extends MyUserException{
    public AgeException() {
        super();
    }

    public AgeException(String message) {
        super(message);
    }
}
