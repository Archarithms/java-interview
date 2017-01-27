package com.github.archarithms;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Hello world!
 *
 */
public class App
{
  public static void main(String[] args)
  {
    System.out.println("Hello World!");
  }

  public static String titleCase(String input)
  {

    StringBuilder result = new StringBuilder();

    if (null != input)
    {
      String[] arr = input.split("_");

      for (int i = 0; i < arr.length; i++)
      {

        int count = 0;

        for (char c : arr[i].toCharArray())
        {

          if (count++ == 0)
            result.append(Character.toUpperCase(c));
          else
            result.append(Character.toLowerCase(c));

        }
        if (i < arr.length)
          result.append(" ");
      }

    } else
      return null;

    if (result.length() > 0)
      result.deleteCharAt(result.length() - 1);

    System.out.println(result.toString());

    return result.toString();

  }

  public static String findDateStringFromEpoch(String epoch)
  {

    DateTimeFormatter format = DateTimeFormat.forPattern("MMMMM d, yyyy");

    if (null != epoch)
    {

      try
      {

        long seconds = Long.parseLong(epoch);

        DateTime dt = new DateTime(seconds * 1000);

        String dtString = dt.toString(format);

        System.out.println(dtString);

        return dt.toString(format);

      } catch (NumberFormatException e)
      {
        System.err.println("Epoch: " + epoch + " Not a Number");
        return now(format);
      }

    }

    return now(format);

  }

  private static String now(DateTimeFormatter format)
  {
    return DateTime.now().toString(format);
  }
}
