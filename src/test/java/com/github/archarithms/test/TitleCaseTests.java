package com.github.archarithms.test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.github.archarithms.App;

/**
 * TitleCaseTests unit tests for simple App.
 */
public class TitleCaseTests {

    @Test
    public void testConvertToTitleCase() {
        String testStr = "Title Case";
        assertTrue(testStr.equals(App.convertToTitleCase("TITLE_CASE")));
    }

    @Test
    public void testNumbers() {
        String testStr = "Number 3";
        assertTrue(testStr.equals(App.convertToTitleCase("NUMBER_3")));
    }

    @Test
    public void testOtherChars() {
        String testStr = "Truth Track";
        assertTrue(testStr.equals(App.convertToTitleCase("TRUTH-TRACK")));
    }

    @Test
    public void testForNoAdditionalSpaces() {
        String testStr = "Test";
        assertTrue(testStr.equals(App.convertToTitleCase("test  ")));
    }

    /**
     * What is the expected result if the input is something like "111"?  Since we're returning a String rather than an Optional<String>,
     * my assumption is that we'll return an empty String.
     */
    @Test
    public void testNumericalString() {
        String testStr = "";
        assertTrue(testStr.equals(App.convertToTitleCase("111")));
    }

    @Test
    public void testNullString() {
        assertThrows(Exception.class, () -> App.convertToTitleCase(null));
    }
}
