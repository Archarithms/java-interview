package com.github.archarithms.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
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
     * Test the testConvertToTitleCase method
     */
    @Test
    public void testConvertToTitleCaseNoWhitespace() {
        String testStr = "Title Case";
        assertTrue(testStr.equals(App.convertToTitleCase("   TITLE_CASE   ")));
    }

    /**
     * Test the testConvertToTitleCase method
     */
    @Test
    public void testConvertToTitleCase() {
        String testStr = "Title Case";
         System.out.println(App.convertToTitleCase("TITLE_CASE"));
        assertTrue(testStr.equals(App.convertToTitleCase("TITLE_CASE")));
    }

    /**
     * Test the testNumbers method
     */
    @Test
    public void testNumbers() {
        String testStr = "Number 3";
        assertTrue(testStr.equals(App.convertToTitleCase("NUMBER_3")));
    }

    /**
     * Test the testOtherChars method
     */
    @Test
    public void testOtherChars() {
        String testStr = "Truth Track";
        assertTrue(testStr.equals(App.convertToTitleCase("TRUTH-TRACK")));
    }
}
