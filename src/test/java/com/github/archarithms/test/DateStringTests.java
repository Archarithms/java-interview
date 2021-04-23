package com.github.archarithms.test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;

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
    	try {
    		String testStr = "July 4, 2017";
    		String result = App.convertUnixToDateString(1499144400L);
        	assertTrue(testStr.equals(result));
        } catch(IOException e) {
        	fail("Exception thrown");
        }
    }

    /**
     * Test the testNullCase method
     */
    @Test
    public void testNullCase() {
        assertThrows(Exception.class, () -> App.convertUnixToDateString(null));
    }
}
