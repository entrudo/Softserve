package com.softserve.edu.firsthomework.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The application that compares two envelopes and determines which can fit in another envelope
 * @author Alex
 * @version 1.0
 */

public class App {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static String help = "In order for the program to work you need to enter the data one" +
            " by one of two envelopes, each value must be greater than 0 in the following format:" +
            " 99.99";


    public static void main(String[] args) throws IOException {

        while (true) {

            //Add data for first envelope
            System.out.println("Please enter size of first envelope\nPlease enter side a:");
            String sideAOfEnvelopeOne = reader.readLine();
            System.out.println("\nPlease enter side b:");
            String sideBOfEnvelopeOne = reader.readLine();

            //Create first envelope
            Envelope envelope = new Envelope(sideAOfEnvelopeOne, sideBOfEnvelopeOne);
            envelope.areaOfEnvelope();

            //Add data for second envelope
            System.out.println("\nPlease enter size of second envelope\nPlease enter side a:");
            String sideAOfEnvelopeSecond = reader.readLine();
            System.out.println("\nPlease enter side b:");
            String sideBOfEnvelopeSecond = reader.readLine();

            //Create second envelope
            Envelope secondEnvelope = new Envelope(sideAOfEnvelopeSecond,
                    sideBOfEnvelopeSecond);
            secondEnvelope.areaOfEnvelope();

            //Calculate result of compare envelopes
            String result = envelope.compareEnvelope(envelope.getAreaOfEnvelope(), secondEnvelope
                    .getAreaOfEnvelope());

            //Print result of compare envelopes
            System.out.println(result);

            //Exit function
            if (!exit()){
                return;
            }
        }

    }

    /**
     *Method that allow exit from application
     *
     * @return true if user wnats to continue and false if user wants to exit from application
     * @throws IOException
     */
    public static boolean exit() throws IOException{
        System.out.println("\nDo you want check envelop again? Y/ N");
        String exit = reader.readLine();
        if (exit.equalsIgnoreCase("y") || exit.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }
    }
}
