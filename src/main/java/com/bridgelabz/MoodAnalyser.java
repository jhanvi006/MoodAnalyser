package com.bridgelabz;

public class MoodAnalyser {

    public String moodAnalyse(String message) {
        if (message.contains("sad")){
            return "SAD";
        }
        else
            return null;
    }
}
