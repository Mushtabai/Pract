package ru.mirea.it.ivbo01.ex4;
import java.text.SimpleDateFormat;
import java.util.*;


public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год, месяц и число (ГГГГ ММ ДД):");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        System.out.println("Введите часы и минуты (ЧЧ мм):");
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();

        Calendar calendar = new GregorianCalendar(year, month - 1, day, hours, minutes);
        Date date = calendar.getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String formattedDate = dateFormat.format(date);
        System.out.println(formattedDate);
    }
}
