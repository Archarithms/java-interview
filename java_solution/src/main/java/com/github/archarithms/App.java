package com.github.archarithms;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class App
{
  public static String convertToTitleCase(final String inpStr) throws Exception
  {
    if (inpStr == null) {
      throw new Exception();
    }

    String[] words = inpStr.split("[^a-zA-Z0-9]");
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      String head = word.substring(0, 1);
      String tail = word.substring(1);
      words[i] = head.toUpperCase() + tail.toLowerCase();
    }
    return String.join(" ", words);
  }

  public static String convertUnixToDateString() throws Exception
  {
    Long seconds = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

    return convertUnixToDateString(seconds);
  }

  public static String convertUnixToDateString(final Long inpUnixSeconds) throws Exception
  {
    if (inpUnixSeconds == null) {
      throw new Exception();
    }

    LocalDateTime date = LocalDateTime.ofEpochSecond(inpUnixSeconds, 0, ZoneOffset.UTC);
    DateTimeFormatter formatter = patternedFormatter();

    return date.format(formatter);
  }

  public static DateTimeFormatter patternedFormatter() {
    return DateTimeFormatter.ofPattern("MMMM d, yyyy");
  }
}
