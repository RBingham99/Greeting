package com.sparta.rb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FilmClassificationsTest {
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    @DisplayName("Check against ages under 4 without adult")
    public void checkAgainstAgesUnder4WithoutAdult(int age) {
        Assertions.assertEquals("No films are available.",FilmClassifications.availableClassifications(age, false));
    }
    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7})
    @DisplayName("Check against ages from 4 to 8 without adult")
    public void checkAgainstAgesFrom4To12WithoutAdult(int age) {
        Assertions.assertEquals("U films are available.",FilmClassifications.availableClassifications(age, false));
    }

    @ParameterizedTest
    @ValueSource(ints = {8, 9, 10, 11})
    @DisplayName("Check against ages from 8 to 12 without adult")
    public void checkAgainstAgesFrom8To12WithoutAdult(int age) {
        Assertions.assertEquals("U & PG films are available.",FilmClassifications.availableClassifications(age, false));
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 13, 14})
    @DisplayName("Check against ages from 12 to 15 without adult")
    public void checkAgainstAgesFrom12To15WithoutAdult(int age) {
        Assertions.assertEquals("U, PG & 12 films are available.",FilmClassifications.availableClassifications(age, false));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 16, 17})
    @DisplayName("Check against ages from 15 to 18 without adult")
    public void checkAgainstAgesOver15WithoutAdult(int age) {
        Assertions.assertEquals("U, PG, 12, 12A & 15 films are available.",FilmClassifications.availableClassifications(age, false));
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 19, 20, 21})
    @DisplayName("Check against ages 18 and over without adult")
    public void checkAgainstAges18AndOverWithoutAdult(int age) {
        Assertions.assertEquals("All films are available.",FilmClassifications.availableClassifications(age, false));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    @DisplayName("Check against ages under 4 with adult")
    public void checkAgainstAgesUnder4WithAdult(int age) {
        Assertions.assertEquals("No films are available.",FilmClassifications.availableClassifications(age, true));
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7})
    @DisplayName("Check against ages from 4 to 8 with adult")
    public void checkAgainstAgesFrom4To8WithAdult(int age) {
        Assertions.assertEquals("U films are available.",FilmClassifications.availableClassifications(age, true));
    }
    @ParameterizedTest
    @ValueSource(ints = {8, 9, 10, 11})
    @DisplayName("Check against ages from 8 to 12 with adult")
    public void checkAgainstAgesFrom8To12WithAdult(int age) {
        Assertions.assertEquals("U & PG films are available.",FilmClassifications.availableClassifications(age, true));
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 13, 14})
    @DisplayName("Check against ages from 12 to 15 with adult")
    public void checkAgainstAgesFrom12To15WithAdult(int age) {
        Assertions.assertEquals("U, PG, 12 & 12A films are available.",FilmClassifications.availableClassifications(age, true));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 16, 17})
    @DisplayName("Check against ages from 15 to 18 with adult")
    public void checkAgainstAgesOver15WithAdult(int age) {
        Assertions.assertEquals("U, PG, 12, 12A & 15 films are available.",FilmClassifications.availableClassifications(age, true));
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 19, 20, 21})
    @DisplayName("Check against ages 18 and over with adult")
    public void checkAgainstAges18AndOverWithAdult(int age) {
        Assertions.assertEquals("All films are available.",FilmClassifications.availableClassifications(age, true));
    }
}
