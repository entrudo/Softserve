package com.softserve.edu.Home_Work_1.Task5.Numbers;

public class Decade {
    private static String one = "десять";
    private static String two = "двадцать";
    private static String three = "тридцать";
    private static String four = "сорок";
    private static String five = "пятьдесят";
    private static String six = "шестьдесят";
    private static String seven = "семьдесят";
    private static String eight = "восемьдесят";
    private static String nine = "девяносто";
    private static String zero = "";

    public static String decadePrint(String content){
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
