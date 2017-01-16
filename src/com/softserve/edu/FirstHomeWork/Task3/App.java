package com.softserve.edu.FirstHomeWork.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Double, String> sTriagle = new HashMap<Double, String>();


        while (true){
            //Read information about Triangle
            System.out.println("Please enter data of triangle");

            String triangle = reader.readLine();

            String[] arrayStrings = triangle.split(",");
            double a;
            double b;
            double c;

            try {
                a = Integer.parseInt(arrayStrings[1].trim());
                b = Integer.parseInt(arrayStrings[2].trim());
                c = Integer.parseInt(arrayStrings[3].trim());
            }catch (Exception e){
                System.out.println("You should enter data in next format: <name of Triangle> <side 1> <side 2> <side 3>");
                return;
            }

            //Calculate square of Triangle
            double p = (double) 1/2 * (a + b + c);
            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            // add Triangles to HashMap
            sTriagle.put(s, arrayStrings[0].trim());


            //Function exit
            System.out.println("Do you want to enter new triangle");
            String exit = reader.readLine();

            if (exit.toLowerCase().equals("y") || exit.toLowerCase().equals("yes")){
                System.out.println();
            }else {
                //Publish information about Triangles
                Map<Double, String> sortedMap = new TreeMap<Double, String>(Collections.reverseOrder());
                sortedMap.putAll(sTriagle);

                System.out.println("============= Triangles list: ===============");
                for (Map.Entry<Double, String> temp : sortedMap.entrySet()){
                    count = count + 1;
                    System.out.println(count + "." + "[" + temp.getValue() + "]:" + " " + temp.getKey() + " cm");
                }

                return;
            }
        }
    }
}
