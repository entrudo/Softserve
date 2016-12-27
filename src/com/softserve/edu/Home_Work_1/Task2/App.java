package com.softserve.edu.Home_Work_1.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            // first envelope
            System.out.println("Please enter size of first envelope\nPlease enter side a:");
            int a = Integer.parseInt(reader.readLine());
            System.out.println("\nPlease enter side b:");
            int b = Integer.parseInt(reader.readLine());

            // second envelope
            System.out.println("\nPlease enter size of second envelope\nPlease enter side a:");
            int c = Integer.parseInt(reader.readLine());
            System.out.println("\nPlease enter side b:");
            int d = Integer.parseInt(reader.readLine());

            //Find space of envelopes
            int sFirstEnvelope = a * b;
            int sSecondEnvelope = c * d;

            //Write result about check envelopes
            if (sFirstEnvelope > sSecondEnvelope) {
                System.out.println("\nYou can put Second envelope to First");
            } else {
                if (sFirstEnvelope < sSecondEnvelope) {
                    System.out.println("\nYou can put First envelope to Second");
                } else {
                    System.out.println("\nFirst and Second envelopes are equals ");
                }
            }

            //Exit function
            System.out.println("\nDo you want check envelop again?");
            String exit = reader.readLine();
            if (exit.toLowerCase().contains("y") || exit.toLowerCase().contains("yes")){
                System.out.println();
            }else {
                return;
            }
        }

    }
}
