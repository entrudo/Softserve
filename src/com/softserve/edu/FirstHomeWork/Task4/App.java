package com.softserve.edu.FirstHomeWork.Task4;

import java.io.*;

public class App {
    private static String content = "";
    private static int count = 0;
    private static String word = "";
    private static String changeWord = "";

    public static void main(String[] args) throws IOException {

        //E:\Project\SoftServe\src\com\softserve\edu\FirstHomeWork\Task4\Text.txt

        if (args.length <= 1 || args.length > 3){
            System.out.println("If you want to count word you should use the next construction: <address of file> <word for find> \n" +
                    "or if you want to change word in the file use next construction: <address of file> <word to change> <new word>");
            return;
        }

        if (args.length == 2){

            try {
                content = readFile(args[0]);
            }catch (Exception e){
                System.out.println("Please check the file on next address: " + args[0]);
                return;
            }

            word = args[1];
            countWord(content);
        }

        if (args.length == 3){

            try {
                content = readFile(args[0]);
            }catch (Exception e){
                System.out.println("Please check the file on next address: " + args[0]);
                return;
            }

            word = args[1];
            changeWord = args[2];
            content = replaceWord(content);
            writeFile(args[0], content);
        }
    }

    public static void writeFile (String nameFile, String text) throws IOException {
        File fileDelete = new File(nameFile);
        File file2 = new File("New File");
        file2.mkdir();
        File file = new File("New File/" + fileDelete.getName());
        file.createNewFile();
        PrintWriter print = new PrintWriter(file.getAbsoluteFile());
        print.write(text);
        print.close();
//        fileDelete.delete();
        System.out.println("You can find your file in new directory " + file.getAbsolutePath());
    }

    public static String replaceWord(String content){
        StringBuffer buffer = new StringBuffer();

        String[] array = content.split(" ");

        for (int i = 0; i < array.length; i++){
            if (array[i].contains(",") || array[i].contains(".") || array[i].contains(";") || array[i].contains("?") || array[i].contains("!")){
                array[i] = array[i].substring(0, array[i].length() - 1);
            }
        }

        for (int i = 0; i < array.length; i++){
            if (array[i].toLowerCase().equals(word.toLowerCase())){
                array[i] = array[i].replace(word.toLowerCase(), changeWord.toLowerCase());
            }
            buffer.append(array[i]);
            buffer.append(" ");
        }

        return buffer.toString();
    }

    public static void countWord(String content){

        String[] array = content.split(" ");

        for (int i = 0; i < array.length; i++){
            if (array[i].contains(",") || array[i].contains(".") || array[i].contains(";") || array[i].contains("?") || array[i].contains("!")){
                array[i] = array[i].substring(0, array[i].length() - 1);
            }
        }

        for (int i = 0; i < array.length; i++){
            if (array[i].toLowerCase().equals(word.toLowerCase())){
                count++;
            }
        }

        System.out.println("There is " + count + " matches!");
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
}
