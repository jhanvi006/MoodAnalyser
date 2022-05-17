package com.bridgelabz;

public class MoodAnalyser {
    public static String message;
    public MoodAnalyser(String message) throws MoodAnalyserException {
        this.message = message;
//        moodAnalyse();
    }
    public String moodAnalyse() throws MoodAnalyserException {
        try {
            if (message.length() == 0)
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.EMPTY,"Entered empty mood.");
            else if (message.toLowerCase().contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch (NullPointerException e){
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NULL,"Entered null mood.");
        }
    }
}
