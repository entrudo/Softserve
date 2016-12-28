package com.softserve.edu.Home_Work_1.Task8;

import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {
            if (args.length == 0 || args.length > 2) {
                System.out.println("To start, use the following type:\n" +
                        "app.jar border output values\n" +
                        "Example: java -jar SoftServe.jar 0 50");
                return;
            }
            gi
            String[] readArgs = args;

            int firstNumber = Integer.parseInt(readArgs[0]);
            int secondNumber = Integer.parseInt(readArgs[1]);

            int lengthOfArray = secondNumber - firstNumber;

            int[] array = new int[lengthOfArray + 1];
            for (int i = 0; i < array.length; i++){
                array[i] = firstNumber + i;
                System.out.print(array[i] + " ");
            }

            int temp = 0;
            for (int i = 0; i < array.length; i++){
                if (i > 1){
                    temp = array[i-2] + array[i-1];
                    System.out.print(temp + " ");
                }else {
                    System.out.print(array[i] + " ");
                }
            }
    }

}
