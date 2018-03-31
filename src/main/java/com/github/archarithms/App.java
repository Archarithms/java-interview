package com.github.archarithms;
import java.util.Date;
import java.text.SimpleDateFormat;

public class App
{
  public static String convertToTitleCase(final String inpStr)
  {
    if(inpStr == null){
        throw new IllegalArgumentException("Invalid parameters");
    }

    StringBuilder sb = new StringBuilder();
    boolean firstChar = true;
    int spacesToAdd = 0;


    for(int i = 0; i < inpStr.length(); i++){
        char c = inpStr.charAt(i);
        char newChar = 0;
        
        if(Character.isLetter(c) || Character.isDigit(c)){ 
            if(Character.isUpperCase(c) && !firstChar){
                newChar = Character.toLowerCase(c);
            }else{
                newChar = c;
            } 

            //Only add spaces if another alphanumeric character is encountered.
	    if(firstChar && spacesToAdd > 0){
                for(int k = 0; k < spacesToAdd; k++){
                    sb.append(" ");
                }
            }

            firstChar = false;
	    spacesToAdd = 0;
        }else{
            //keep track of spaces to add for non alphanumeric chars. Do not add preceding non alpha numeric chars. 
            if(sb.length() > 0){
                spacesToAdd++;
            }

            firstChar = true;
        }

        //Append character            
        if(newChar > 0){
            sb.append(newChar);
        }
    }

    return sb.toString();
  }

  public static String convertUnixToDateString(final Long inpUnixSeconds)
  {
    if(inpUnixSeconds == null){
        throw new IllegalArgumentException("Invalid parameters!");
    }

    long millisecondsSinceEpoch = inpUnixSeconds * 1000; //Convert seconds to milliseconds
    Date date = new Date(millisecondsSinceEpoch);
    SimpleDateFormat sdf = new SimpleDateFormat("MMMMM d, yyyy");
    String formattedDate = sdf.format(date); 

    return formattedDate;
  }
}
