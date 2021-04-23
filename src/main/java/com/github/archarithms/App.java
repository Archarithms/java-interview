package com.github.archarithms;

import java.io.IOException;
import java.util.Date;

import org.apache.commons.lang3.text.WordUtils;

public class App
{
  public static String convertToTitleCase(final String inpStr)
  {
	String cleanString = inpStr.replaceAll("[^a-zA-Z0-9]", " ");
	return WordUtils.capitalizeFully(cleanString);
  }

  public static String convertUnixToDateString(final Long inpUnixSeconds) throws IOException
  {
	if(inpUnixSeconds == null)
		throw new IOException("null input");
	Date finalDate = new Date(inpUnixSeconds*1000);
	DateObject returnDate = new DateObject(finalDate);
    return String.valueOf(formatDate(returnDate));
  }
  
  private static String formatDate(DateObject dateObject) {
	  return String.valueOf(dateObject.getMonth() +  " " + dateObject.getDay() + ", " + dateObject.getYear());
  }
}
