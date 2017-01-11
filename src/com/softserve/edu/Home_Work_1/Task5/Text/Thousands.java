package com.softserve.edu.Home_Work_1.Task5.Text;

public class Thousands {
    private static String one = "тысяча";
    private static String two = "тысяч";
    private static String three = "тысячи";

    public static String printText(String content){
        String number = "";

        switch (Integer.parseInt(content)){
            case 1:
                number = one;
                break;
            case 2:
                number = three;
                break;
            case 3:
                number = three;
                break;
            case 4:
                number = two;
                break;
            case 5:
                number = two;
                break;
            case 6:
                number = two;
                break;
            case 7:
                number = two;
                break;
            case 8:
                number = two;
                break;
            case 9:
                number = two;
                break;
            case 0:
                number = two;
                break;

            default:
        }
        return number;
    }
}
