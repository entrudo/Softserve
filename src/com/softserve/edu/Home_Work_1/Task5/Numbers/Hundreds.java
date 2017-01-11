package com.softserve.edu.Home_Work_1.Task5.Numbers;

public class Hundreds {
    private static String one = "сто";
    private static String two = "двести";
    private static String three = "триста";
    private static String four = "четыреста";
    private static String five = "пятьсот";
    private static String six = "шестьсот";
    private static String seven = "семьсот";
    private static String eight = "восемьсот";
    private static String nine = "девятьсот";
    private static String zero = "";

    public static String hundredsPrint(String content){
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
