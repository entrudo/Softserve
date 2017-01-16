package com.softserve.edu.firsthomework.task5;

public class App {
    private static StringBuffer stringBuffer = new StringBuffer();
    private static String help = "You should use the next construction: <program> <number to change> \n" +
            "You should enter only number, like 123456789012\n" +
            "Number should not start from 0";
    private static String[] billion = {"миллиардов", "миллиард", "миллиарда", "миллиарда", "миллиарда",
            "миллиардов", "миллиардов", "миллиардов", "миллиардов", "миллиардов"};
    private static String[] million = {"миллионов", "миллион", "миллиона", "миллиона", "миллиона",
            "миллионов", "миллионов", "миллионов", "миллионов", "миллионов",};
    private static String[] thousand = {"тысяч", "тысяча", "тысячи", "тысячи", "тысячи",
            "тысяч", "тысяч", "тысяч", "тысяч", "тысяч"};
    private static String[] numberOfDecade = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят",
            "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
    private static String[] numberOfOne = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь",
            "восемь", "девять", "одна", "две"};
    private static String[] numberOfTens = {"десять", "одинадцать", "двенадцать", "тринадцать", "четырнадцать",
        "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
    private static String[] numberOfHundreds = {"", "сто", "двести", "триста", "четыреста", "пятьсот",
        "шестьсот", "семьсот", "восемьсот", "девятьсот"};

    public static void main(String[] args) {

        if (args.length == 0 || args.length > 1 || !isDigit(args[0]) ||
                args[0].startsWith("0") || args[0].length() == 0 ||
                args[0].length() > 12){
            System.out.println(help);
            return;
        }

        String number = addNullValue(args[0]) + args[0];

        String millards = number.substring(0, 3);
        String millons = number.substring(3, 6);
        String thousands = number.substring(6, 9);
        String decade = number.substring(9, 12);

        printValue(millards, billion, false, false);
        printValue(millons, million, false, false);
        printValue(thousands, thousand, true, false);
        printValue(decade, million, false, true);
        System.out.println(stringBuffer.toString().substring(0, 1).toUpperCase() +
                stringBuffer.toString().substring(1, stringBuffer.length()));
    }

    public static void printValue(String type, String[] array, Boolean typeThousands, Boolean typeDecade){
        if (!Character.toString(type.charAt(0)).equals("s")) {
            stringBuffer.append(numberOfHundreds[Integer.parseInt(Character.toString(type.charAt(0)))]);
            if (!Character.toString(type.charAt(0)).equals("0")) {
                stringBuffer.append(" ");
            }
        }

        if (!Character.toString(type.charAt(1)).equals("s")) {
            if (Character.toString(type.charAt(1)).equals("1")){
                stringBuffer.append(numberOfTens[Integer.parseInt(Character.toString(type.charAt(2)))]);
            }else {
                stringBuffer.append(numberOfDecade[Integer.parseInt(Character.toString(type.charAt(1)))]);
            }
            if (!Character.toString(type.charAt(1)).equals("0")) {
                stringBuffer.append(" ");
            }
        }

        if (!Character.toString(type.charAt(1)).equals("1") && !Character.toString(type.charAt(2)).equals("s")) {
            if (Character.toString(type.charAt(2)).equals("1") && typeThousands) {
                stringBuffer.append(numberOfOne[10]);
                stringBuffer.append(" ");
            }

            if (Character.toString(type.charAt(2)).equals("2") && typeThousands) {
                stringBuffer.append(numberOfOne[11]);
                stringBuffer.append(" ");
            }

            if (Integer.parseInt(Character.toString(type.charAt(2))) > 2 && typeThousands) {
                stringBuffer.append(numberOfOne[Integer.parseInt(Character.toString(type.charAt(2)))]);
                stringBuffer.append(" ");
            }

            if (!Character.toString(type.charAt(2)).equals("s") && !typeThousands) {
                stringBuffer.append(numberOfOne[Integer.parseInt(Character.toString(type.charAt(2)))]);
                if (!Character.toString(type.charAt(2)).equals("0")) {
                    stringBuffer.append(" ");
                }
            }

            if (!Character.toString(type.charAt(2)).equals("s") && !typeDecade) {
                stringBuffer.append(array[Integer.parseInt(Character.toString(type.charAt(2)))]);
                stringBuffer.append(" ");
            }
        }
    }

    public static Boolean isDigit(String number){
        boolean result = true;
        try {
            Double.parseDouble(number);
        } catch (Exception e) {
            result = false;
        }
        return result;
    }

    public static String addNullValue(String value){
        String result = "";

        for (int i = value.length(); i < 12; i++){
            result += 's';
        }

        return result;
    }
}