package com.bridgelabz;

public class MoodAnalyser {

    public String moodAnalyse(String message) {
        if (message.contains("sad")){
            return "SAD";
        } else if (message.contains("happy")) {
            return "HAPPY";
        } else
            return null;
    }
}
