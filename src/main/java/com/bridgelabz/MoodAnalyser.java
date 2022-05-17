package com.bridgelabz;

public class MoodAnalyser {
    public static String message;
    public MoodAnalyser(String message) throws MoodAnalyserException {
        this.message = message;
        moodAnalyse();
    }
    public String moodAnalyse() throws MoodAnalyserException {
        try {
            if (message.toLowerCase().contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
            throw new MoodAnalyserException("Entered invalid mood.");
        }
    }
}
