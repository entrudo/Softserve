package com.softserve.edu.Home_Work_1.Task5.Text;

public class Million {
    private static String one = "миллион";
    private static String two = "миллионов";

    public static String printText(String content){
        String number = "";

        switch (Integer.parseInt(content)){
            case 1:
                number = two;
                break;
            case 2:
                number = one;
                break;
            case 3:
                number = two;
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
