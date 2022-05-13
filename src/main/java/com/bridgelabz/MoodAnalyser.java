package com.bridgelabz;

public class MoodAnalyser {
    public static String message;
    public MoodAnalyser(String message){
        this.message = message;
        moodAnalyse();
    }
    public String moodAnalyse() {
        if (message.contains("Sad")){
            return "SAD";
        } else if (message.contains("Happy")) {
            return "HAPPY";
        } else
            return "HAPPY";
    }
}
