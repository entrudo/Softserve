package com.softserve.edu.FirstHomeWork.Task1;

public class App {
    public static void main(String[] args) {

        if (args.length == 0){
            System.out.println("To start, use the following type:\n" +
                    "app.jar height of chessboard and width of chessboard\n" +
                    "Example: java -jar SoftServe.jar 10 20");
            return;
        }

        String[] readArgs = args;

        int a = Integer.parseInt(readArgs[0]);
        int b = Integer.parseInt(readArgs[1]);

        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                if (i % 2 != 0){
                    System.out.print("* ");
                }else {
                    System.out.print(" *");
                }

            }
            System.out.println();
        }
    }
}
