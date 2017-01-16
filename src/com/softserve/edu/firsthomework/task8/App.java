package com.softserve.edu.firsthomework.task8;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
            if (args.length == 0 || args.length > 2) {
                System.out.println("To start, use the following type:\n" +
                        "app.jar border output values\n" +
                        "Example: java -jar SoftServe.jar 0 50");
                return;
            }
            String[] readArgs = args;

            int firstNumber = Integer.parseInt(readArgs[0]);
            int secondNumber = Integer.parseInt(readArgs[1]);

            int lengthOfArray = secondNumber - firstNumber;

            int[] array = new int[lengthOfArray + 1];
            for (int i = 0; i < array.length; i++){
                array[i] = firstNumber + i;
            }

        int a = array[0];
        int b = array[1];
        int fib = 0;
            for (int j = 0; j < array.length; j++){
                if (j > 1){
                    fib = a + b;
                    a = b;
                    b = fib;
                    if (fib >= secondNumber){
                        return;
                    }
                    System.out.print(fib + " ");
                }else {
                    System.out.print(array[j] + " ");
                }
            }
    }

}
