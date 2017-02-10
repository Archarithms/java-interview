package com.github.archarithms;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public static String convertToTitleCase(final String inpStr) { // converToTitleCase will run as a function, string are the arguments, then input the string
        String[] splitStr = inpStr.toLowerCase().split("_"); // the var splitStr will take the input THIS_INPUT and should split it by the '_'
        for (int i = 0; i < splitStr.length; i++) { // for statement to figure out the length of an input
            splitStr[i] = splitStr[i].substring(0, 1).toUpperCase() + splitStr[i].substring(1); 
        }
        return String.join(" ", splitStr);
    }
    
    public static String convertToCamelCase(final String inpStr) {
        String[] splitStr = inpStr.toLowerCase().split("_");
        for (int i = 0; i < splitStr.length; i++) {
            char currentChar = inpStr.charAt(i);
            char lowerCase = Character.toLowerCase(currentChar);
            splitStr1 = lowerCase;
            char upperCase = Character.toUpperCase(currentChar);
            splitStr2 = upperCase;
        }
        return String.join(" ", splitStr1, splitStr2);
    }
}
