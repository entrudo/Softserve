package com.softserve.edu.Home_Work_1.Task8;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        if (args.length == 0 || args.length > 2){
            System.out.println("To start, use the following type:\n" +
                    "app.jar border output values\n" +
                    "Example: java -jar SoftServe.jar 0 50");
            return;
        }

        String[] readArgs = args;
        int firstNumber = Integer.parseInt(readArgs[0]);
        int secondNumber = Integer.parseInt(readArgs[1]);

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = firstNumber; i <= secondNumber; i++){
            list.add(i);
        }

        for (int i = firstNumber; i <= secondNumber; i++){
            int temp = 0;
            temp =  + i-2;
            if (temp < secondNumber){
                System.out.println(temp);
            }
        }

    }
}
