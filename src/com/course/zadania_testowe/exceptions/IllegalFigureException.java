package com.course.zadania_testowe.exceptions;

public class IllegalFigureException extends Exception{
    IllegalFigureException(){};
    IllegalFigureException(String message){
        super(message);
    }
}
