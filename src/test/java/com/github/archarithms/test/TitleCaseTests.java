package com.github.archarithms.test;

import org.junit.jupiter.api.Test;

import com.github.archarithms.App;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * TitleCaseTests unit tests for simple App.
 */
public class TitleCaseTests
{

    /*
     * UNCOMMENT THE UNIT TESTS TO RUN THEM. FEEL FREE TO ADD MORE!
     */

    /**
     * Test the testConvertToTitleCase method
     */
    @Test
    public void testConvertToTitleCase() throws Exception {
        String testStr = "Title Case";
        assertTrue(testStr.equals(App.convertToTitleCase("TITLE_CASE")));
    }

    /**
     * Test the testNumbers method
     */
    @Test
    public void testNumbers() throws Exception {
        String testStr = "Number 3";
        assertTrue(testStr.equals(App.convertToTitleCase("NUMBER_3")));
    }

    /**
     * Test the testOtherChars method
     */
    @Test
    public void testOtherChars() throws Exception {
        String testStr = "Truth Track";
        assertTrue(testStr.equals(App.convertToTitleCase("TRUTH-TRACK")));
    }

    /**
     * Test the testMultipleChars method
     */
    @Test
    public void testMultipleChars() throws Exception {
        String testStr = "Case Three Extra Chars";
        assertTrue(testStr.equals(App.convertToTitleCase("CASE-THREE_extra[chars]///")));
    }

    /**
     * Test the testNullString method
     */
    @Test
    public void testNullString() {
        assertThrows(Exception.class, () -> App.convertToTitleCase(null));
    }
}
