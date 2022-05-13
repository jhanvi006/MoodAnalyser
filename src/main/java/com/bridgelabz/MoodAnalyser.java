package com.bridgelabz;

public class MoodAnalyser {
    public static String message;
    public MoodAnalyser(String message){
        this.message = message;
        moodAnalyse();
    }
    public String moodAnalyse() {
        try {
            if (message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }
        catch (NullPointerException e) {
            return null;
        }
    }
}
