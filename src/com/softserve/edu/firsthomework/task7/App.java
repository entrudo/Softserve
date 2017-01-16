package com.softserve.edu.firsthomework.task7;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        if (args.length == 0 || args.length > 1){
            System.out.println("To start, use the following type:\n" +
                    "app.jar and number of border\n" +
                    "Example: java -jar SoftServe.jar 10");
            return;
        }

        String[] readArgs = args;
        int number = Integer.parseInt(readArgs[0]);
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.println("Please enter the number of big border:");
//        int number = Integer.parseInt(reader.readLine());

        for (int i = 0; i < number; i++){
            int temp = (int) Math.pow(i, 2);
            if (temp < number){
                if (i == 0){
                }else {
                    System.out.print(", ");
                }
                System.out.print(temp);
            }
        }

    }
}
