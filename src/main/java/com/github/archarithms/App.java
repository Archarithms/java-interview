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
    result = WordUtils.capitalizeFully(result);
    
    return result;
  }
  
  public static String convertUnixToDateString()
  {
    // Get the current date.
    LocalDate dt = LocalDate.now();
    
    // Specify the desired date format.
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MMMM d, yyyy").withZone(ZoneId.systemDefault());
    
    // Return the current date.
    return dt.format(fmt).toString();
  }

  public static String convertUnixToDateString(final Long inpUnixSeconds) throws NullPointerException
  {
    // Specify the desired date format.
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MMMM d, yyyy").withZone(ZoneId.systemDefault());
    
    // Throw exception if the input is null.
     if (inpUnixSeconds == null){
      throw new NullPointerException();
    } 

    // Otherwise convert the unix epoch seconds to a datetime.
    Instant inst = Instant.ofEpochSecond(inpUnixSeconds);
    return fmt.format(inst);
  }
}
