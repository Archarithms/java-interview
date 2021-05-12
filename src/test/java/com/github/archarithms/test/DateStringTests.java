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

//    @Test
//    public void testestConvertUnixToDateStringWrongType() {
//        int wrongType = 50000;
//        assertThrows(Exception.class, () -> App.convertUnixToDateString(wrongType));

//NOTE: cant test for wrong type as the function being tested does not accept generic types
// will produce a compile time error due to strong tlyping rules
//}

    /**
     * Test overloaded convertUnixToDateString no params
     * NOTE: The testStr variable needs set to today's date or the test will fail
     * Set testStr to todays date and then uncomment to run test.
     */
    /* @Test
    public void testToday() {
        String testStr = "May 12, 2021";
        assertTrue(testStr.equals(App.convertUnixToDateString()));
    } */


}
