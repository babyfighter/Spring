package com.bjpowernode.exception;

//throw NameException when user name has error
public class NameException  extends  MyUserException{
    public NameException() {
        super();
    }

    public NameException(String message) {
        super(message);
    }
}
