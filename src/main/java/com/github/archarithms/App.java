package com.github.archarithms;

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
}
