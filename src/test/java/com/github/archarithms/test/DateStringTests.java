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
    /**
     * Test the testConvertUnixToDateString method
     */
    @Test
    public void testConvertUnixToDateString() {
        String testStr = "July 4, 2017";
        assertTrue(testStr.equals(App.convertUnixToDateString(1499144400L)));
    }
    

    /**
     * Test that a null value throws the custom exception
     */
    @Test
    public void testNull() {
        Exception e = assertThrows(IllegalArgumentException.class,
        		() -> App.convertUnixToDateString(null),
        		"msg");
        assertTrue(e.getMessage().contains("Error: Input seconds must not be null"));
    }
    
    /**
     * Test that converting without passing an argument gives today's date.
     * 
     * NOTE: testStr needs to be properly set here to match today's date string
     * in order to pass, so this test is commented out for now. To test, set the
     * testStr properly and then uncomment.
     */
    /* @Test
    public void testToday() {
        String testStr = "January 31, 2021";
        assertTrue(testStr.equals(App.convertUnixToDateString()));
    } */
    
}
