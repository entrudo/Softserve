package com.softserve.edu.Home_Work_1.Task5;

import com.softserve.edu.Home_Work_1.Task5.Numbers.Decade;
import com.softserve.edu.Home_Work_1.Task5.Numbers.Hundreds;
import com.softserve.edu.Home_Work_1.Task5.Numbers.One;
import com.softserve.edu.Home_Work_1.Task5.Text.Billion;

public class App {
    private static char[] arraySymbol;
    private static String number = "";
    private static String millards = "";
    private static String millons = "";
    private static String thousands = "";
    private static String decade = "";
    private static StringBuffer stringBuffer = new StringBuffer();


    public static void main(String[] args) {
        if (args.length == 0 || args.length > 1 ){
            System.out.println("You should use the next construction: <program> <number to change>");
        }

        if (isDigit(args[0]) == false){
            System.out.println("You should enter only number, like 123456789012");
        }

        if (args[0].length() == 0 || args[0].length() > 12){
            System.out.println("You should enter max 10 number");
        }

        if (args[0].substring(0, 1).equals("0")){
            System.out.println("Number should not start from 0");
        }

        number = addNullValue(args[0]) + args[0];

        millards = number.substring(0, 3);
        millons = number.substring(3, 6);
        thousands = number.substring(6, 9);
        decade = number.substring(9, 12);

        addPrintMillardValue(millards);

        number = stringBuffer.toString().substring(0, 1).toUpperCase() + stringBuffer.toString().substring(1, stringBuffer.length());
        System.out.println(number);



//        arraySymbol = args[0].toCharArray();



//        for (int i = 0; i < arraySymbol.length; i++){
//            String temp = String.valueOf(arraySymbol[i]);
//            temp = One.onePrint(temp);
////            System.out.println(One.onePrint(temp));
//            String firstSymbol = temp.substring(0, 1).toUpperCase();
//            System.out.println(firstSymbol + temp.substring(1, temp.length()));
//        }

    }

    public static void addPrintMillardValue(String millards){
        for (int i = 0; i < 3; i++){
            if (i == 0) {
                if (Character.toString(millards.charAt(0)).equals("s")) {
                }else {
                    stringBuffer.append(Hundreds.hundredsPrint(Character.toString(millards.charAt(0))));
                    if (!Character.toString(millards.charAt(0)).equals("0")) {
                        stringBuffer.append(" ");
                    }
                }
            }

            if (i == 1) {
                if (Character.toString(millards.charAt(1)).equals("s")) {
                }else {
                    stringBuffer.append(Decade.decadePrint(Character.toString(millards.charAt(1))));
                    if (!Character.toString(millards.charAt(1)).equals("0")) {
                        stringBuffer.append(" ");
                    }
                }
            }

            if (i == 2) {
                if (Character.toString(millards.charAt(2)).equals("s")) {
                }else {
                    stringBuffer.append(One.onePrint(Character.toString(millards.charAt(2))));
                    if (!Character.toString(millards.charAt(2)).equals("0")) {
                        stringBuffer.append(" ");
                    }
                }

                stringBuffer.append(Billion.printText(Character.toString(millards.charAt(2))));
                stringBuffer.append(" ");
            }
        }
    }

    public static void addPrintMillionsValue(String millons){

    }

    public static void addPrintThousandsValue(String thousands){

    }

    public static void addPrintDecadeValue(String decade){

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

    public static String addNullValue(String value){
        String result = "";

        for (int i = value.length(); i < 12; i++){
            result += 's';
        }

        return result;
    }

}
