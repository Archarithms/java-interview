package com.github.archarithms.test;

import org.junit.jupiter.api.Test;

import com.github.archarithms.App;

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
    public void testConvertToTitleCase_Nominal() {
        String testStr = "Title Case";
        assertEquals("TITLE CASE", App.convertToTitleCase(testStr));
    }

    /**
     * Test that upper-casing works with number literals
     */
    @Test
    public void testConvertToTitleCase_Numbers() {
        String testStr = "Number 3";
        assertEquals("NUMBER 3", App.convertToTitleCase(testStr));

    }

    /**
     * Test that upper-casing works with different characters
     */
    @Test
    public void testConvertToTitleCase_OtherChars() {
        String testStr = "Truth-Track";
        assertEquals("TRUTH-TRACK", App.convertToTitleCase(testStr));

    }

    /**
     * Test that upper-casing will preserve whitespace.
     */
    @Test
    public void testConvertToTitleCase_WhiteSpace()
    {
        String testStr = "   test  ";
        assertEquals("   TEST  ", App.convertToTitleCase(testStr));

        // Verify equals isn't trimming or eliminating whitespace
        assertNotEquals("TEST", App.convertToTitleCase(testStr));
    }
}
