package com.softserve.edu.Home_Work_1.Task5.Numbers;

public class Tens {
    private static String ten = "десять";
    private static String eleven = "одинадцать";
    private static String twelve = "двенадцать";
    private static String thirteen = "тринадцать";
    private static String fourteen = "четырнадцать";
    private static String fifteen = "пятнадцать";
    private static String sixteen  = "шестнадцать";
    private static String seventeen = "семнадцать";
    private static String eighteen = "восемнадцать";
    private static String nineteen = "девятнадцать";

    public static String tensPrint(String content){
        String number = "";

        switch (Integer.parseInt(content)){
            case 0:
                number = ten;
                break;
            case 1:
                number = eleven;
                break;
            case 2:
                number = twelve;
                break;
            case 3:
                number = thirteen;
                break;
            case 4:
                number = fourteen;
                break;
            case 5:
                number = fifteen;
                break;
            case 6:
                number = sixteen;
                break;
            case 7:
                number = seventeen;
                break;
            case 8:
                number = eighteen;
                break;
            case 9:
                number = nineteen;
                break;
            default:
        }
        return number;
    }
}
