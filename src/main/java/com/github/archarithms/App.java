package com.github.archarithms;

import java.io.*;
import java.util.*; 
import java.util.stream.*; 
import java.nio.charset.StandardCharsets;


public class App
{
  public static String convertToTitleCase(final String input)
  {
    if(input.equals(null) || input.equals("") ) {
      throw new Error("invalid input");
    }

    IntStream filtered = input.chars().map(element -> {
      if(Character.isLetterOrDigit(element) || Character.isWhitespace(element)){
        return element;
      }
      else return (int)' ';
    });


    String filteredString = filtered
                        .collect(
                          StringBuilder::new,
                          StringBuilder::appendCodePoint,
                          StringBuilder::append)
                        .toString();
    
    // create a lower case assumption
    filteredString = filteredString.toLowerCase();
    
    // capitalize each word
    String[] strings = filteredString.split(" ");
    for(int i = 0; i < strings.length; i++) {
      // capitalize first character and append the rest unchanged
      strings[i] = strings[i].substring(0,1).toUpperCase() + strings[i].substring(1);
    }
    
    // put it all together
    String titleCase = String.join(" ", strings);

    return titleCase;
  }

  public static String convertUnixToDateString(final Long input)
  {
    Long secondsInYear = 60L * 60L * 24L * Double.valueOf(365.25).longValue();
    Long secondsInDay = 60L * 60L * 24L;
    String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    int epochYear = 1970;

    Long year = Math.floorDiv(input, Double.valueOf(secondsInYear).longValue()) + Long.valueOf(epochYear);
    boolean isLeapYear = (year % 4) == 0 ? true : false;
    int[] daysInMonth = isLeapYear ? new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} : new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    Long elapsedSecondsOfYear = (input % secondsInYear);
    Long dayOfYear = Math.floorDiv(elapsedSecondsOfYear, secondsInDay) - Math.floorDiv(year - epochYear, 4);

    int i = 0;
    Long dayOfMonth = (dayOfYear == 0) ? 1 : dayOfYear;
    while(i < daysInMonth.length) {
      if((dayOfMonth - daysInMonth[i]) > 0) {
        dayOfMonth = dayOfMonth - daysInMonth[i];
        i++;
      }
      else {
        break;
      }
    }

    return String.format("%s %d, %d", months[i], dayOfMonth, year);
  }
}
