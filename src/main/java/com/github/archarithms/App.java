package com.github.archarithms;


import org.apache.commons.text.*;// external library
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import java.util.Date;
import java.text.SimpleDateFormat;

public class App
{
  // convert string to title case
  public static String convertToTitleCase(final String inpStr)
  {
    //check for null
    if (inpStr == null)
    {
      throw new NullPointerException();
	}

    //lowercase conversion
    String tempStr = inpStr.toLowerCase();

    //remove non alphaNum chars with regex
    tempStr = tempStr.replaceAll("[^a-zA-Z0-9]"," ");

    //remove standard whitespace chars
    tempStr = tempStr.trim();

    String outStr = WordUtils.capitalize(tempStr);

    return outStr;

  }

  //convert epoch tome value in seconds to  Date format
  public static String convertUnixToDateString(final Long inpUnixSeconds)
  {
    //check for null
    if(inpUnixSeconds==null)
    {
      throw new NullPointerException();
    }
    else     //convert from epoch time
    {
    return LocalDateTime.ofInstant(Instant.ofEpochSecond(inpUnixSeconds),
            ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("MMMM d, YYYY"));
    }

  }

  // get todays date and return as string
    public static String convertUnixToDateString()
  {
    Date date = new Date();

    long date_sec = date.getTime()/1000;

    return convertUnixToDateString(date_sec);
  }
}
