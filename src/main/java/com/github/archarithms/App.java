package com.github.archarithms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App
{
  public static String convertToTitleCase(final String inpStr) throws Exception
  {
    // TITLE_CASE

    String ret = "";

    if (inpStr == null) {
      throw new Exception("Failboat");
    }

    for (int i = 0; i < inpStr.length(); i++) {
      if (Character.isLetter(inpStr.charAt(i))) {
        if (i > 0) {
          if (Character.isLetter(inpStr.charAt(i - 1))) {
            ret = ret + Character.toLowerCase(inpStr.charAt(i));
          } else {
            ret = ret + Character.toUpperCase(inpStr.charAt(i));
          }
        } else // handle first letter
        {
          ret = ret + Character.toUpperCase(inpStr.charAt(i));
        }
      } else if (Character.isDigit(inpStr.charAt(i))) {
        ret = ret + inpStr.charAt(i);
      } else {
        ret = ret + ' ';
        // inpStr.replace(inpStr.charAt(i), ' ');
      }
    }

    ret.trim();

    return ret;
  }

  public static String convertUnixToDateString(final Long inpUnixSeconds) throws Exception
  {
    /*
     * Date date = new Date(1318386508000L); DateFormat format = new
     * SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
     * format.setTimeZone(TimeZone.getTimeZone("Etc/UTC")); String formatted =
     * format.format(date); System.out.println(formatted);
     * format.setTimeZone(TimeZone.getTimeZone("Australia/Sydney")); formatted =
     * format.format(date); System.out.println(formatted);
     */

    if (inpUnixSeconds == null)
      throw new Exception("why u do dis");

    Date date = new Date(inpUnixSeconds * 1000L);
    DateFormat format = new SimpleDateFormat("MMMMM d, yyyy");
    String formatted = format.format(date);

    return formatted;

    // return String.valueOf(inpUnixSeconds);
  }
}
