package ru.mirea.it.ivbo01;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class Two {
    public static void main(String[] args) {
        double X[] = {1.4, 30.4, 2.5, 19.6, 8.7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите товар из списка,указав его число:    "+
                "Футболка - 1    " + "Утюг - 2    " + "Шапка - 3    " + "Телефон - 4    " + "Кроссовки - 5" );
        int choice1 = scanner.nextInt();
        double val[] = {1, 0.93,7.28,1.23};
        System.out.println("Выберите валюту из списка,указав его число: "+
                "Доллар - 1    " + "Евро - 2    " + "Юань - 3    " + "Фунт - 4    ");
        int choice2 = scanner.nextInt();
        double res = X[choice1 -1]*val[choice2-1];

        NumberFormat numberFormat;

        switch (choice2) {
            case 1 -> numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
            case 2 -> numberFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            case 3 -> numberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
            default -> numberFormat = NumberFormat.getCurrencyInstance(Locale.UK);
        }

        System.out.println(numberFormat.format(res));

    }
}


