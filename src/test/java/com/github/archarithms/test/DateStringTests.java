package com.github.archarithms.test;

import com.github.archarithms.App;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * DateStringTests unit tests for simple App.
 */
public class DateStringTests
{
    /**
     * Test the testConvertUnixToDateString method
     */
    @Test
    public void testConvertUnixToDateString_Nominal()
    {
        String testStr = "July 4, 2017";
        assertEquals(testStr, App.convertUnixToDateString(1499144400L, "GMT-5"));
    }

    /**
     * Test the testConvertUnixToDateString method for mismatched time zone
     */
    @Test
    public void testConvertUnixToDateString_TimeZoneMismatch()
    {
        String pstTimeStr = "July 3, 2017";
        String estTimeStr = "July 4, 2017";
        String convertedStr = App.convertUnixToDateString(1499144400L, "GMT-8");
        assertEquals(pstTimeStr, convertedStr);
        assertNotEquals(estTimeStr, convertedStr);
    }

    /**
     * Test the testConvertUnixToDateString method throws an exception for null cases
     */
    @Test
    public void testConvertUnixToDateString_Null_ThrowsException()
    {
        assertThrows(Exception.class, () -> App.convertUnixToDateString(null, "GMT-5"));
    }
}
