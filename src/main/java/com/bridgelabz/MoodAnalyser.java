package com.bridgelabz;

public class MoodAnalyser {

    public String moodAnalyse(String message) {
        if (message.contains("Sad")){
            return "SAD";
        } else if (message.contains("Happy")) {
            return "HAPPY";
        } else
            return null;
    }
}
