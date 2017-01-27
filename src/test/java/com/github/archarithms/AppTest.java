package com.github.archarithms;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
  /**
   * Create the test case
   *
   * @param testName
   *          name of the test case
   */
  public AppTest(String testName)
  {
    super(testName);
  }

  /**
   * @return the suite of tests being tested
   */
  public static Test suite()
  {
    return new TestSuite(AppTest.class);
  }

  /**
   * Rigourous Test :-)
   */
  public void testApp()
  {
    assertTrue(App.titleCase("THIS_INPUT").equals("This Input"));
    assertNull(App.titleCase(null));
    assertFalse(App.titleCase("THIS_INPUT").equals("THIS INPUT"));
    assertEquals(App.titleCase(""), "");

    assertEquals(App.findDateStringFromEpoch("1499144400"), "July 4, 2017");

    Long nowLong = System.currentTimeMillis();
    Long secs = nowLong / 1000;

    String nowString = App.findDateStringFromEpoch(secs.toString());

    assertEquals(App.findDateStringFromEpoch(null), nowString);

    assertEquals(App.findDateStringFromEpoch("LDJFLDJ"), nowString);

  }

}
