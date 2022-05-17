package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("User is Sad.");
        String result = moodAnalyser.moodAnalyse();
        System.out.println(result);
        Assertions.assertEquals("SAD", result);
    }
    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("User is Happy.");
        String result = moodAnalyser.moodAnalyse();
        System.out.println(result);
        Assertions.assertEquals("HAPPY", result);
    }
    @Test
    public void givenNewMessage_WhenProper_ShouldReturnSad() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad mood.");
        String result = moodAnalyser.moodAnalyse();
        System.out.println(result);
        Assertions.assertEquals("SAD", result);
    }
    @Test
    public void givenNewMessage_WhenProper_ShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any mood.");
        String result = moodAnalyser.moodAnalyse();
        System.out.println(result);
        Assertions.assertEquals("HAPPY", result);
    }
//    @Test
//    public void givenNullMessage_WhenProper_ShouldReturnHappy() throws MoodAnalyserException {
//        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
//        String result = moodAnalyser.moodAnalyse();
//        System.out.println(result);
//        Assertions.assertEquals("HAPPY", result);
//    }
    @Test
    public void givenNullMessage_WhenProper_ShouldReturnExceptionHandled() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            String result = moodAnalyser.moodAnalyse();
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.NULL,result);
        } catch (MoodAnalyserException e) {
            System.out.println(e.getMessage());
        }
    }
}
