package com.softserve.edu.firsthomework.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The application that compares two envelopes and determines which can fit in another envelope
 *
 * @author Alex
 * @version 1.0
 */

public class App {
    public static final String HELP_STRING = "In order for the program to work you need to enter " +
            " the data one by one of two envelopes, each value must be greater than 0 in  the " +
            "following format: 99.99";
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        new App().run();
    }

    /**
     * Method for run application.
     */
    private void run() {
        Envelope envelope;
        Envelope secondEnvelope;

        while (true) {
            try {
                envelope = createdNewEnvelope();
                envelope.calculateAreaOfEnvelope();

                secondEnvelope = createdNewEnvelope();
                secondEnvelope.calculateAreaOfEnvelope();

                //Calculate and print result of compare envelopes
                String result = envelope.compareEnvelope(secondEnvelope.getAreaOfEnvelope());
                System.out.println(result);

                if (!exit()) {
                    return;
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println(HELP_STRING);
                System.exit(0);
            }
        }
    }

    /**
     * Method that allow exit from application
     *
     * @return true if user wants to continue and false if user wants to exit from application
     * @throws IOException
     */

    private boolean exit() throws IOException {
        System.out.println("\nDo you want check envelop again? Y/ N");
        String exit = reader.readLine();
        return exit.equalsIgnoreCase("y") || exit.equalsIgnoreCase("yes");
    }

    /**
     * Method that created new Envelope with parameters that user write from keyboard
     *
     * @return new Envelope
     * @throws IOException
     */
    private Envelope createdNewEnvelope() throws IOException {

        System.out.println("Please enter size of envelope\nPlease enter side a:");
        String sideAOfEnvelopeOne = reader.readLine();
        System.out.println("\nPlease enter side b:");
        String sideBOfEnvelopeOne = reader.readLine();

        return new Envelope(sideAOfEnvelopeOne, sideBOfEnvelopeOne);
    }
}
