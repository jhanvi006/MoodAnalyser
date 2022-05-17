package com.bridgelabz;

public class MoodAnalyserException extends Exception{
    ExceptionType type;
    public enum ExceptionType {
        NULL, EMPTY;
    }
    public MoodAnalyserException(ExceptionType type, String message){
        super(message);
        this.type = type;
    }
}
