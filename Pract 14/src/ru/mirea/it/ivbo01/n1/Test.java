package ru.mirea.it.ivbo01.n1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String prices = "16 USS, 17 USD, 21024.231 RUB, 60?324 BUBLS, 35.532 EU 0 EU ";
        String regex = "((\\d+|\\d+\\.\\d+) (USD|RUB|EU))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(prices);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
        System.out.println();


        String text = "(1 + 8) – 9 / 4 \n" + "6 / 5 – 2 * 9";
        regex = "(\\d.[^+]|\\d$)";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Найдено: " + matcher.group().substring(0, 1));

        }
        System.out.println();

        text = "29/02/2000 30/04/2003 01/01/2003 29/02/2001 30-04-2003 1/1/1899 29/02/2004 ";
        regex = "(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19\\d{2}|[2-9]\\d{3})";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(text);

        while (matcher.find()) {
            String str = matcher.group();
            System.out.print("Найдено: " + str);
            int year = Integer.parseInt(str.substring(6));
            int month = Integer.parseInt(str.substring(3,5));
            int day = Integer.parseInt(str.substring(0,2));
            if ((!((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) && month == 2 && day >= 29)){
                System.out.println(" Неправильный");
            }
            else {
                System.out.println(" Правильный");
            }

        }
        System.out.println();

        text = "user@example.com root@localhost myhost@@@com.ru zaborov.d.i@edu.mirea.ru, @my.ru, Julia String";
        regex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\b";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Найдено: " + matcher.group());
        }
        System.out.println();

    }
}