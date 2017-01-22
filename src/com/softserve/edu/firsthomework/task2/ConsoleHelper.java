package com.softserve.edu.firsthomework.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Class that helped get and give messages from user
 * @author Alex
 * @version 1.0
 */

public class ConsoleHelper {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static final String HELP_STRING = "In order for the program to work you need to enter " +
            " the data one by one of two envelopes, each value must be greater than 0 in  the " +
            "following format: 99.99";

    /**
     * Method that read from console and return this string
     *
     * @param message that will print in console
     * @return String that user enter with console
     * @throws IOException
     */
    public String readFromConsole(String message) throws IOException {
        System.out.println(message);
        return reader.readLine();
    }

    /**
     * Method that allow exit from application
     *
     * @return true if user wants to continue and false if user wants to exit from application
     * @throws IOException
     */

    public boolean exit(String exit){
        return exit.equalsIgnoreCase("y") || exit.equalsIgnoreCase("yes");
    }

    /**
     * Method that print error message
     *
     * @param e This param has object error
     */
    public void sayUserAboutError(Exception e){
        System.out.println(HELP_STRING);
        System.out.println(e.getStackTrace());
    }
	
	/**
	 * Method that print user information
	 * @param context This will be printed in console
	 */
	public void printMessage(String context){
		System.out.println(context);
	}
}
