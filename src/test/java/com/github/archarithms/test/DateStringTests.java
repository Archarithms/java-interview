package com.github.archarithms.test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

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


    /**
     * Test the testNoInput method
     */
    @Test
    public void testNoInput() {
        LocalDate dt = LocalDate.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MMMM d, yyyy").withZone(ZoneId.systemDefault());
        String testStr = dt.format(fmt).toString();
        assertTrue(testStr.equals(App.convertUnixToDateString()));
    }

        /**
     * Test the testWrongType method
     * Note: Java is a strongly typed language. As such the compiler will catch mismatches at compile time.
     * This can be tested by uncommenting the test case below:
     */
/*     @Test
    public void testWrongType() {
        assertThrows(Exception.class, () -> App.convertUnixToDateString("149914400L"));
    } */
}
