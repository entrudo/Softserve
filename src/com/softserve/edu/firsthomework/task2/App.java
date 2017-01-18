package com.softserve.edu.firsthomework.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The application that compares two envelopes and determines which can fit in another envelope
 *
 *  @author Alex
 * @version 1.0
 */

public class App {
    public static String help = "In order for the program to work you need to enter the data one" +
            " by one of two envelopes, each value must be greater than 0 in the following format:" +
            " 99.99";
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Envelope envelope;
    private static Envelope secondEnvelope;


    public static void main(String[] args) throws IOException {

        while (true) {

            try {
                envelope = createdNewEnvelope();
            } catch (NumberFormatException e){
                System.out.println(help);
                System.exit(0);
            }
            envelope.calculateAreaOfEnvelope();

            try {
                secondEnvelope = createdNewEnvelope();
            } catch (NumberFormatException e){
                System.out.println(help);
                System.exit(0);
            }
            secondEnvelope.calculateAreaOfEnvelope();

            //Calculate and print result of compare envelopes
            String result = envelope.compareEnvelope(secondEnvelope.getAreaOfEnvelope());
            System.out.println(result);

            if (!exit()){
                return;
            }
        }

    }

    /**
     *Method that allow exit from application
     *
     * @return true if user wants to continue and false if user wants to exit from application
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

    /**
     * Method that created new Envelope with parameters that user write from keyboard
     *
     * @return new Envelope
     * @throws IOException
     */
    public static Envelope createdNewEnvelope() throws IOException{

        System.out.println("Please enter size of envelope\nPlease enter side a:");
        String sideAOfEnvelopeOne = reader.readLine();
        System.out.println("\nPlease enter side b:");
        String sideBOfEnvelopeOne = reader.readLine();

        return new Envelope(sideAOfEnvelopeOne, sideBOfEnvelopeOne);
    }
}
