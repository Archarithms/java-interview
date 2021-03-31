package com.github.archarithms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class App {

      public static String convertToTitleCase(final String inpStr) {
          // Throw a more helpful exception than Exception
          if(inpStr == null) {
              throw new IllegalArgumentException("Input string should not be null.");
          }

          // remove non-alphanumeric, replace with spaces
          String result = inpStr.replaceAll("[^a-zA-Z0-9]", " ");

          // apply title case
          return Arrays.stream(result.split(" "))
                  .map(word -> Character.toTitleCase(word.charAt(0)) + word.substring(1).toLowerCase())
                  .collect(Collectors.joining(" "));
      }

      public static String convertUnixToDateString(final Long inpUnixSeconds) {
          return String.valueOf(inpUnixSeconds);
      }
}
