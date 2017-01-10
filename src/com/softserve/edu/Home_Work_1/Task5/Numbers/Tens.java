package com.softserve.edu.Home_Work_1.Task5.Numbers;

public class Tens {
    private static String ten = "десять";
    private static String eleven = "одинадцать";
    private static String twelve = "двенадцать";
    private static String thirteen = "тренадцать";
    private static String fourteen = "четырнадцать";
    private static String fifteen = "пятнадцать";
    private static String sixteen  = "шестнадцать";
    private static String seventeen = "семнадцать";
    private static String eighteen = "восемнадцать";
    private static String nineteen = "девятнадцать";

    public static String tensPrint(String content){
        String number = "";

        switch (Integer.parseInt(content)){
            case 10:
                number = ten;
                break;
            case 11:
                number = eleven;
                break;
            case 12:
                number = twelve;
                break;
            case 13:
                number = thirteen;
                break;
            case 14:
                number = fourteen;
                break;
            case 15:
                number = fifteen;
                break;
            case 16:
                number = sixteen;
                break;
            case 17:
                number = seventeen;
                break;
            case 18:
                number = eighteen;
                break;
            case 19:
                number = nineteen;
                break;
            default:
        }
        return number;
    }
}
