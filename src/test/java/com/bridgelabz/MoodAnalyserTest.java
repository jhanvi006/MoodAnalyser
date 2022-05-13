package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("User is Sad.");
        String result = moodAnalyser.moodAnalyse();
        System.out.println(result);
        Assertions.assertEquals("SAD", result);
    }
    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("User is Happy.");
        String result = moodAnalyser.moodAnalyse();
        System.out.println(result);
        Assertions.assertEquals("HAPPY", result);
    }
    @Test
    public void givenNewMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad mood.");
        String result = moodAnalyser.moodAnalyse();
        System.out.println(result);
        Assertions.assertEquals("SAD", result);
    }
    @Test
    public void givenNewMessage_WhenProper_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any mood.");
        String result = moodAnalyser.moodAnalyse();
        System.out.println(result);
        Assertions.assertEquals("HAPPY", result);
    }
    @Test
    public void givenNewMessage_WhenProper_ShouldReturnNull() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String result = moodAnalyser.moodAnalyse();
        System.out.println(result);
        Assertions.assertEquals(null, result);
    }
}
