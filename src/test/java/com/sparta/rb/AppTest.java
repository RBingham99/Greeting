package com.sparta.rb;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AppTest {

    @Test
    @DisplayName("Check that 6 returns \"Good morning!\"")
    public void checkThat6ReturnsGoodMorning() {
        Assertions.assertEquals("Good morning!",App.getGreeting(6));
    }

    @ParameterizedTest // Junit Annotation - This is a test
    @ValueSource(ints = {5,8,12}) //source of parameters
    @DisplayName("Check against 5,8 and 12")
    public void checkAgainst5_8_and12(int timeOfDay) {
        Assertions.assertEquals("Good morning!",App.getGreeting(timeOfDay));

    }

    @Test
    @DisplayName("Check that 13 returns \"Good afternoon!\"")
    public void checkThat13ReturnsGoodAfternoon() {
        Assertions.assertEquals("Good afternoon!", App.getGreeting(13));
    }

    @Test
    @DisplayName("Check that 20 returns \"Good evening!\"")
    public void checkThat20ReturnsGoodAfternoon() {
        Assertions.assertEquals("Good evening!", App.getGreeting(20));
    }
}
