/* OpenCommercial.java */

import java.net.*;
import java.io.*;


/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();
    
    String address = "http://www."+ inputline+".com";
    System.out.println(address);
    URL url = new URL(address)
    BufferedReader urlContent = new burreredReader(new InputStreamReader(url.openStream());

    String[] firstFiveLine = new String[5];
        
    String oneInputLine;
    
    int i = 0;
    
    while ((oneInputLine = urlContent.readLine()) != null && i < firstFiveLine.length){
    	firstFiveLine[i] = oneInputLine;
    	i++;
    }
    
    for (int j = firstFiveLine.length -1; j >=0; j--){
    	System.out.println(firstFiveLine[j]);
    }
   
    
  }
}
