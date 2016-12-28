package com.company.Lessons_home_Work.Lesson6_less_Work;

import java.io.BufferedReader;

/**
 * Created by Ent on 21.08.2016.
 */
public class Task1 {
    public static void main(String[] args) {
        String alpha = "alpha";
        String numeric = "numeric";
        String alphanumeric = "alphanumeric";

        System.out.println(randomString(alpha, 15));
        System.out.println(randomString(numeric, 15));
        System.out.println(randomString(alphanumeric, 50));
    }

    public static String randomString(String mode, int length){
        String str1 = "";
        if (mode.equals("alpha")){
            String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
            for (int i = 0; i < length; i++){
                str1 += str.charAt((int)(Math.random()*str.length()+0));
            }
        }

        if (mode.equals("numeric")){
            String str = "0123456789";
            for (int i = 0; i < length; i++){
                str1 += str.charAt((int)(Math.random()*str.length()+0));
            }
        }

        if (mode.equals("alphanumeric")){
            String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
            for (int i = 0; i < length; i++){
                str1 += str.charAt((int)(Math.random()*str.length()+0));
            }
        }
        return str1;
    }
}
