package com.github.archarithms;

import java.util.Date;
import java.text.SimpleDateFormat;

public class App
{
  /*
   * Converts a string to title case, replacing non-alphanumeric characters with spaces
   */
  public static String convertToTitleCase(final String inpStr)
  {
	//throw an exception if input string is null
	if (inpStr==null) {
		throw new IllegalArgumentException("Error: Input string must not be null");
	}
	//replace non-alphanumeric characters with spaces
    String alphanumeric = inpStr.replaceAll("[^A-Za-z0-9]", " ");
    
    //split into words
    String[] words = alphanumeric.split(" ");
    
    String result = "";
    
    for (int i = 0; i < words.length; i++) {
    	//capitalize the first letter, and make the rest of the letters lowercase
    	result += Character.toUpperCase(words[i].charAt(0))
    			+ words[i].substring(1).toLowerCase();
    	//add a space after each word, except the last one
    	if (i != words.length-1) result += " ";
    }
    
    return result;
  }
  
  /*
   * Converts a Unix epoch time in seconds and returns the "Month Day, Year" string representation"
   */
  public static String convertUnixToDateString(final Long inpUnixSeconds)
  {
	//Throw an exception if the input is null
	if (inpUnixSeconds == null) {
		throw new IllegalArgumentException("Error: Input seconds must not be null");
	}
	  
	//Create date object based on Unix milliseconds
	Date date = new Date(inpUnixSeconds*1000);

	//Create text format for the data
	SimpleDateFormat format = new SimpleDateFormat("MMMM d, yyyy");
	
	//return the formatted date
	return format.format(date);
  }
  
  /*
   * Gets the current time and returns the Month Day, Year string representation"
   */
  public static String convertUnixToDateString()
  {
	//Get the current time
	Date date = new Date();
	long current_ms = date.getTime();
	
	//Call the matching function that takes the seconds argument
	return convertUnixToDateString(current_ms/1000);
  }
}
