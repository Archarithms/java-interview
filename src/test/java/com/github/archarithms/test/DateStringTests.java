package com.github.archarithms.test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.github.archarithms.App;

/**
 * DateStringTests unit tests for simple App.
 */
public class DateStringTests
{

    /*
     * UNCOMMENT THE UNIT TESTS TO RUN THEM. FEEL FREE TO ADD MORE!
     */

    /**
     * Test the testConvertUnixToDateString method
     */
    @Test
    public void testConvertUnixToDateString() {
        String testStr = "July 4, 2017";
        assertTrue(testStr.equals(App.convertUnixToDateString(1499144400L)));
    }

    /**
     * Test the testNullCase method
     */
    @Test
    public void testNullCase() {
        assertThrows(Exception.class, () -> App.convertUnixToDateString(null));
    }
}
