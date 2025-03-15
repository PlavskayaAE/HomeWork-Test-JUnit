package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.regex.Matcher;

public class BookTest {
    Book forExample = new Book();

    @org.junit.jupiter.api.Test
    public void testIsBig_True() {
        //given:
        forExample.pages = 1300;
        //when:
        final boolean result = forExample.isBig();
        //then:
        Assertions.assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    public void testIsBig_False() {
        //given:
        forExample.pages = 200;
        //when:
        final boolean result = forExample.isBig();
        //then:
        Assertions.assertFalse(result);
    }

    //Просто посмотреть как работает. Должен падать на значениях до 500.
    @ParameterizedTest
    @ValueSource(ints = {1, 499, 500, 501, 599, 1399999, -7})
    void testIsBig_TrueOrFalse(int argument) {
        forExample.pages = argument;
        final boolean result = forExample.isBig();
        Assertions.assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    public void testGetFullTitle() {
        // given:
        forExample.title = "String";
        forExample.relaseYear = 2025;
        final String expected = "String, 2025";
        // when:
        String result = forExample.getFullTitle();
        // then:
        Assertions.assertEquals(expected, result);
    }



}
