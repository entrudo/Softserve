package com.softserve.edu.Home_Work_1.Task5.Text;

public class Billion {
    private static String one = "миллиард";
    private static String two = "миллиарда";
    private static String three = "миллиардов";

    public static String printText(String content){
        String number = "";

        switch (Integer.parseInt(content)){
            case 1:
                number = one;
                break;
            case 2:
                number = two;
                break;
            case 3:
                number = two;
                break;
            case 4:
                number = two;
                break;
            case 5:
                number = three;
                break;
            case 6:
                number = three;
                break;
            case 7:
                number = three;
                break;
            case 8:
                number = three;
                break;
            case 9:
                number = three;
                break;
            case 0:
                number = three;
                break;

            default:
        }
        return number;
    }
}
