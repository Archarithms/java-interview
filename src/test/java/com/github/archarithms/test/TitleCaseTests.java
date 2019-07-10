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
   * 
   * @throws Exception
   */
    @Test
  public void testConvertToTitleCase() throws Exception {
        String testStr = "Title Case";
        assertTrue(testStr.equals(App.convertToTitleCase("TITLE_CASE")));
    }

    /**
   * Test the testNumbers method
   * 
   * @throws Exception
   */
    @Test
  public void testNumbers() throws Exception {
        String testStr = "Number 3";
        assertTrue(testStr.equals(App.convertToTitleCase("NUMBER_3")));
    }

    /**
   * Test the testOtherChars method
   * 
   * @throws Exception
   */
    @Test
  public void testOtherChars() throws Exception {
        String testStr = "Truth Track";
        assertTrue(testStr.equals(App.convertToTitleCase("TRUTH-TRACK")));
    }
}
