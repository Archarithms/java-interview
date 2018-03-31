package com.giithub.archarithms.interview_project;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import com.github.archarithms.App;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Unit test for simple App.
 */
public class DateString extends TestCase
{
  /**
   * Create the test case
   *
   * @param testName name of the test case
   */
  public DateString(String testName)
  {
    super(testName);
  }

  /**
   * @return the suite of tests being tested
   */
  public static Test suite()
  {
    return new TestSuite(DateString.class);
  }

  /*
   * UNCOMMENT THE UNIT TESTS TO RUN THEM. FEEL FREE TO ADD MORE!
   */

  /**
   * Test the testConvertUnixToDateString method
   */
  public void testConvertUnixToDateString()
   {
       String testStr = "July 4, 2017";
       System.out.println(App.convertUnixToDateString(1499144400L));
       assertTrue(testStr.equals(App.convertUnixToDateString(1499144400L)));
   }

  /**
   * Test the testConvertUnixToDateString method
   */
   public void testNullCase()
   {
       try{
           App.convertUnixToDateString(null);
           fail("Should have thrown exception!");
       }catch(Exception e){
//           System.out.println(e);
           assertTrue(e instanceof IllegalArgumentException);
       }
   }
}
