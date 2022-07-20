package com.github.archarithms;

/**
 * Arcarithm Coding Interview
 * Christopher Eastridge
 * 7/20/2022
 */
public class App
{
  /**
   * Converts a string to UPPER-CASE
   * @param inpStr The string you want to UPPER-CASE
   * @return The string as UPPER-CASE
   */
  public static String convertToTitleCase(final String inpStr)
  {
    return inpStr.toUpperCase();
  }

  public static String convertUnixToDateString(final Long inpUnixSeconds)
  {
    return String.valueOf(inpUnixSeconds);
  }
}
