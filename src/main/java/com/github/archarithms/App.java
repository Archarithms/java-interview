package com.github.archarithms;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.stream.Collectors;

public class App {

    private static final String WORD_SEPARATOR = " ";

    public static String convertToTitleCase(final String inpStr) {
        // Throw a more helpful exception than Exception
        if(inpStr == null) {
            throw new IllegalArgumentException("Null input provided.");
        }

        // remove non-alphanumeric, replace with spaces
        String result = inpStr.replaceAll("[^a-zA-Z0-9]", " ");

        // apply title case (source: baeldung), ternary operator to protect against accessing by invalid index
        //   e.g., "    test".
        return Arrays.stream(result.split(WORD_SEPARATOR))
                .map(word -> word.isEmpty() ? word : Character.toTitleCase(word.charAt(0)) + word.substring(1).toLowerCase())
                .collect(Collectors.joining(WORD_SEPARATOR));
    }

    public static String convertUnixToDateString(final Long inpUnixSeconds) {
        if(inpUnixSeconds == null) {
            throw new IllegalArgumentException("Null input provided.");
        }

        // using system default zone because challenge didn't stipulate anything in particular
        return LocalDateTime.ofInstant(Instant.ofEpochSecond(inpUnixSeconds), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("MMMM d, YYYY"));
    }
}
