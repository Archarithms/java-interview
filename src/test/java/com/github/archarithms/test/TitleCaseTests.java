package com.github.archarithms.test;

import org.junit.jupiter.api.Test;

import com.github.archarithms.App;

import static org.junit.jupiter.api.Assertions.*;

/**
 * TitleCaseTests unit tests for simple App.
 */
public class TitleCaseTests {

    @Test
    public void testConvertToTitleCase() {
        String testStr = "Title Case";
        assertEquals(testStr, App.convertToTitleCase("TITLE_CASE"));
    }

    @Test
    public void testNumbers() {
        String testStr = "Number 3";
        assertEquals(testStr, App.convertToTitleCase("NUMBER_3"));
    }

    @Test
    public void testMess() {
        String testStr = "Case Three Extra Chars";
        assertEquals(testStr, App.convertToTitleCase("CASE-THREE_extra[chars]///"));
    }

    @Test
    public void testOtherChars() {
        String testStr = "Truth Track";
        assertEquals(testStr, App.convertToTitleCase("TRUTH-TRACK"));
    }

    @Test
    public void testForNoAdditionalSpaces() {
        String testStr = "Test";
        assertEquals(testStr, App.convertToTitleCase("test  "));
    }

    @Test
    public void testAllNumbers() {
        String testStr = "33";
        assertEquals(testStr, App.convertToTitleCase("33"));
    }

    @Test
    public void testNullString() {
        assertThrows(IllegalArgumentException.class, () -> App.convertToTitleCase(null));
    }
}
