package com.softserve.edu.Home_Work_1.Task6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    private static String moskow = "moskow";
    private static String piter = "piter";
    private static int numbersOfFirstHalf = 0;
    private static int numbersOfSecondHalf = 0;
    private static BufferedReader reader;
    private static String addressOfFile = "";

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please add address to file with method:");
        addressOfFile = readFile(reader.readLine());
        //E:\Project\SoftServe\src\com\softserve\edu\Home_Work_1\Task6\Moskow.txt

        while (true){
            System.out.println("Please enter the number of ticket:");
            String temp = "";
            try{
                temp = reader.readLine();

                if (temp.length() > 6 || temp.length() < 6){
                    System.out.println("You should only 6 character");
                    return;
                }

                if (isDigit(temp) == false){
                    System.out.println("You should only 6 character and it should be digit like: 123456");
                    return;
                }
            }catch (Exception e){
                System.out.println("You should only 6 character. Like: 123456");
            }

            if (addressOfFile.contains(moskow)){
                System.out.println("Moskow method " + moskowMethod(temp));
            }else {
                if (addressOfFile.contains(piter)){
                    System.out.println("Piter method " + piterMethod(temp));
                }
            }

            if (exit() == false){
                return;
            }
        }

    }

    public static String readFile(String nameFile) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(nameFile));
        String content = "";
        StringBuilder stringBuilder = new StringBuilder();
        while ( (content = reader.readLine()) != null){
            stringBuilder.append(content);
            stringBuilder.append("\n");
        }
        content = stringBuilder.toString();
        return content;
    }

    public static Boolean exit() throws IOException{
        boolean result = true;

        System.out.println("Do you want enter new number? Y/N");
        String exit = reader.readLine();

        if (exit.toLowerCase().contains("y")){
        }else{
            if (exit.toLowerCase().contains("n")){
                result = false;
            }
        }

        return result;
    }

    public static Boolean isDigit(String number){
        boolean result = true;
        try {
            Integer.parseInt(number);
        } catch (Exception e) {
            result = false;
        }
        return result;
    }

    public static String piterMethod(String number){
        String result = "";
        int even = 0;
        int odd = 0;

        char[] array = number.toCharArray();

        for (int i = 1; i <= array.length; i++){
            if (i % 2 == 0){
                even += Integer.parseInt(String.valueOf(array[i - 1]));
            }else {
                odd += Integer.parseInt(String.valueOf(array[i - 1]));
            }
        }

        if (even == odd){
            result = "It is happy ticket!";
        }else {
            result = "It is unhappy ticket!";
        }

        return result;
    }

    public static String moskowMethod(String number){
        String result = "";
        numbersOfFirstHalf = Integer.parseInt(number.substring(0, 1)) + Integer.parseInt(number.substring(1, 2)) + Integer.parseInt(number.substring(2, 3));
        numbersOfSecondHalf = Integer.parseInt(number.substring(3, 4)) + Integer.parseInt(number.substring(4, 5)) + Integer.parseInt(number.substring(5, 6));

        if (numbersOfFirstHalf == numbersOfSecondHalf){
            result = "It is happy ticket!";
        }else {
            result = "It is unhappy ticket!";
        }

        return result;
    }
}
