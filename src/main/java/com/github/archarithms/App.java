package com.github.archarithms;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.WordUtils;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class App
{
  public static String convertToTitleCase(final String inpStr) throws NullPointerException
  {
    // Check for null input
     if (inpStr == null){
      throw new NullPointerException();
    } 
    
    // Remove non-alphanumeric characters and replace them with spaces
    String result = inpStr;
    result = result.replaceAll("[^A-Za-z0-9]", " ");
    
    // Remove trailing spaces
    result = StringUtils.stripEnd(result, " ");

    // Set Correct Case
    //result = StringUtils.lowerCase(result);
    result = WordUtils.capitalizeFully(result);
    
    return result;
  }

  public static String convertUnixToDateString(final Long inpUnixSeconds) throws NullPointerException
  {

    LocalDate dt = LocalDate.now();
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MMMM d, yyyy").withZone(ZoneId.systemDefault());
    String result = null;
    
    // Return the current date if the input is null.
     if (inpUnixSeconds == null){
      result = dt.format(fmt).toString();
      throw new NullPointerException();
    } 

    // Otherwise convert the unix epoch seconds to a datetime.
    Instant inst = Instant.ofEpochSecond(inpUnixSeconds);
    result = fmt.format(inst);
    return result;
  }
}
