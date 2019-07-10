package com.github.archarithms.test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
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
   * 
   * @throws Exception
   */
    @Test
  public void testConvertUnixToDateString() throws Exception {
        String testStr = "July 4, 2017";
        assertTrue(testStr.equals(App.convertUnixToDateString(1499144400L)));
    }

    /**
   * Test the testNullCase method
   * 
   * @throws Exception
   */
    @Test
  public void testNullCase() throws Exception {
        DateTime dt = new DateTime();
        DateTimeFormatter fmt = DateTimeFormat.forPattern("MMMM d, yyyy");
    // assertTrue(dt.toString(fmt).equals(App.convertUnixToDateString(null)));
    // assertTrue("why u do dis" == (App.convertUnixToDateString(null)));
    // assertTrue(App.convertUnixToDateString(null))
    assertThrows(Exception.class, () -> App.convertUnixToDateString(null));
    }
}
