package com.github.archarithms.interview_project;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import com.github.archarithms.App;

/**
 * Unit test for simple App.
 */
public class TitleCase extends TestCase
{
  /**
   * Create the test case
   *
   * @param testName name of the test case
   */
  public TitleCase(String testName)
  {
    super(testName);
  }

  /**
   * @return the suite of tests being tested
   */
  public static Test suite()
  {
    TestSuite suite = new TestSuite(TitleCase.class);
    //suite.addTest(new TitleCase("testConvertToTitleCase"));
    //suite.addTest(new TitleCase("testOtherChars"));
    return suite;
  }


  /*
   * UNCOMMENT THE UNIT TESTS TO RUN THEM. FEEL FREE TO ADD MORE!
   */

   public void testConvertToTitleCase()
   {
       String testStr = "Title Case";
       assertTrue(testStr.equals(App.convertToTitleCase("TITLE_CASE")));
   }
  
  public void testNumbers()
  {
      String testStr = "Number 3";
      assertTrue(testStr.equals(App.convertToTitleCase("NUMBER_3")));
  }
 
 public void testOtherChars()
 {
     String testStr = "Truth Track";
     assertTrue(testStr.equals(App.convertToTitleCase("TRUTH-TRACK")));
 }
 public void testPrecedingChars()
 {
     String testStr = "Truth Track";
     System.out.println(App.convertToTitleCase("^&^&$TRUTH-TRACK)(&^"));
     assertTrue(testStr.equals(App.convertToTitleCase("^&^$TRUTH-TRACK)(&^")));
 }
 public void testTrailingChars()
 {
     String testStr = "Truth Track";
     assertTrue(testStr.equals(App.convertToTitleCase("TRUTH-TRACK)(&^")));
 }
 public void testNull()
 {
     try{
       App.convertToTitleCase(null);
	fail("Should have thrown exception!");
     }catch(RuntimeException e){
     }
 }
}
