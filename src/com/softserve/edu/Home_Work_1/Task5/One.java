package com.softserve.edu.Home_Work_1.Task5;

public class One {
    private static String one = "один";
    private static String two = "два";
    private static String three = "три";
    private static String four = "четыре";
    private static String five = "пять";
    private static String six = "шесть";
    private static String seven = "сем";
    private static String eight = "восемь";
    private static String nine = "девять";
    private static String zero = "ноль";

    public static String onePrint(String content){
        String number = "";

        switch (Integer.parseInt(content)){
            case 1:
                number = one;
                break;
            case 2:
                number = two;
                break;
            case 3:
                number = three;
                break;
            case 4:
                number = four;
                break;
            case 5:
                number = five;
                break;
            case 6:
                number = six;
                break;
            case 7:
                number = seven;
                break;
            case 8:
                number = eight;
                break;
            case 9:
                number = nine;
                break;
            case 0:
                number = zero;
                break;
            default:
        }


        return number;
    }
}
