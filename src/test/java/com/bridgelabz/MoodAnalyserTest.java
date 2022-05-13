package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.moodAnalyse("User is Sad.");
        System.out.println(result);
        Assertions.assertEquals("SAD", result);
    }
    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.moodAnalyse("User is Happy.");
        System.out.println(result);
        Assertions.assertEquals("HAPPY", result);
    }
    @Test
    public void givenNewMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.moodAnalyse("I am in Sad mood.");
        System.out.println(result);
        Assertions.assertEquals("SAD", result);
    }
}
