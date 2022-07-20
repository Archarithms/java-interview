package com.github.archarithms;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Arcarithm Coding Interview
 * Christopher Eastridge
 * 7/20/2022
 */
public class App
{
    /**
     * Converts a string to UPPER-CASE
     *
     * @param inpStr The string you want to UPPER-CASE
     * @return The string as UPPER-CASE
     */
    public static String convertToTitleCase(final String inpStr)
    {
        return inpStr.toUpperCase();
    }

    /**
     * Converts Unix timestamp to a human-readable format
     *
     * @param inpUnixSeconds seconds since epoch
     * @param timeZone       the time zone for the expected conversion
     * @return a human-readable date format
     */
    public static String convertUnixToDateString(final Long inpUnixSeconds, String timeZone)
    {
        // Convert seconds to milliseconds
        Date date = new Date(inpUnixSeconds * 1000L);

        // Provide the format we want the resulting string in
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d, yyyy");

        // Get this date in EST
        dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));

        return dateFormat.format(date);
    }
}
