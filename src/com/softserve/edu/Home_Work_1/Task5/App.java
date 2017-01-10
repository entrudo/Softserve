package com.softserve.edu.Home_Work_1.Task5;

public class App {
    private static char[] arraySymbol;

    public static void main(String[] args) {
        if (args.length == 0 || args.length > 1 ){
            System.out.println("You should use the next construction: <program> <number to change>");
        }

        if (isDigit(args[0]) == false){
            System.out.println("You should enter only number, like 1234567890");
        }

        if (args[0].length() == 0 || args[0].length() > 10){
            System.out.println("You should enter max 10 number");
        }

        arraySymbol = args[0].toCharArray();



        for (int i = 0; i < arraySymbol.length; i++){
            String temp = String.valueOf(arraySymbol[i]);
            temp = One.onePrint(temp);
//            System.out.println(One.onePrint(temp));
            String firstSymbol = temp.substring(0, 1).toUpperCase();
            System.out.println(firstSymbol + temp.substring(1, temp.length()));
        }

    }

    public static Boolean isDigit(String number){
        boolean result = true;
        try {
            Double.parseDouble(number);
            //Integer.parseInt(number);
        } catch (Exception e) {
            result = false;
        }
        return result;
    }

}
