package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.moodAnalyse("User is sad.");
        System.out.println(result);
        Assertions.assertEquals("SAD", result);
    }
    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.moodAnalyse("User is happy.");
        System.out.println(result);
        Assertions.assertEquals("HAPPY", result);
    }
}
