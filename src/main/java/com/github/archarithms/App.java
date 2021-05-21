package com.github.archarithms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App
{
  public static String convertToTitleCase(final String inpStr) throws Exception {
    if (inpStr == null) {
      throw new Exception();
    }
    StringBuilder sb = new StringBuilder();
    // Split up the string and remove all of the garbage characters
    String[] splitInput = inpStr.split("]|-|_|\\[|/");
    for (int i = 0; i < splitInput.length; i++) {
      // Set the entire string to lowercase
      String s = splitInput[i].toLowerCase();
      // check to see if the string contains anything
      if (s.length() > 0) {
        // Set the first letter to Uppercase if possible
        String first = s.substring(0, 1).toUpperCase();
        String temp = s.substring(1);
        // Concat the 2 strings and append it to the StringBuilder
        sb.append(first.concat(temp));
      }
      // Append a space to the StringBuilder this isn't the last string
      if (i < splitInput.length - 1) {
        sb.append(" ");
      }
    }
    return sb.toString();
  }

  public static String convertUnixToDateString(final Long inpUnixSeconds) throws Exception {
    if (inpUnixSeconds == null) {
      throw new Exception();
    }
    // Convert to milliseconds
    Long millis = inpUnixSeconds * 1000;
    // Using DateFormat with a Date to make get the correct format
    Date date = new Date(millis);
    DateFormat format = new SimpleDateFormat("MMMMMMMMM d, y");
    return format.format(date);
  }
}
