package com.github.archarithms.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import java.lang.IllegalArgumentException;

import com.github.archarithms.App;

/**
 * TitleCaseTests unit tests for simple App.
 */
public class TitleCaseTests
{

    /*
     * UNCOMMENT THE UNIT TESTS TO RUN THEM. FEEL FREE TO ADD MORE!
     */

    /**
     * Test an all-caps input with an underscore
     */
    @Test
    public void testConvertToTitleCase() {
        String testStr = "Title Case";
        assertTrue(testStr.equals(App.convertToTitleCase("TITLE_CASE")));
    }

    /**
     * Test an all-caps input with an underscore and number
     */
    @Test
    public void testNumbers() {
        String testStr = "Number 3";
        assertTrue(testStr.equals(App.convertToTitleCase("NUMBER_3")));
    }

    /**
     * Test an all-caps input with a dash
     */
    @Test
    public void testOtherChars() {
        String testStr = "Truth Track";
        assertTrue(testStr.equals(App.convertToTitleCase("TRUTH-TRACK")));
    }
   
    /**
     * Test mix of characters with non-alphanumeric at the end
     */
    @Test
    public void testComplexStr() {
        String testStr = "Case Three Extra Chars";
        assertTrue(testStr.equals(App.convertToTitleCase("CASE-THREE_extra[chars]///")));
    }
    
    /**
     * Test that a null string throws the custom exception
     */
    @Test
    public void testNull() {
        Exception e = assertThrows(IllegalArgumentException.class,
        		() -> App.convertToTitleCase(null),
        		"msg");
        assertTrue(e.getMessage().contains("Error: Input string must not be null"));
    }
}
