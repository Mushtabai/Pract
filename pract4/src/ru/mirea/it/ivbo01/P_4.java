package ru.mirea.it.ivbo01;

public class P_4 {


    public static void main(String args[]) {
        Season mySeason = Season.Лето;
        System.out.println("Мое любимое время года: " + mySeason.name);
        System.out.println("Средняя температура: " + mySeason.Midtemp + " градусов Цельсия");
        System.out.println("Описание: " + mySeason.getDescription());

        for (Season seasons : Season.values())
            System.out.println(seasons);
        for (Season seasons : Season.values()) {
            System.out.println("Информация по текущему времени года: ");
            System.out.println(seasons.name);
            System.out.println(seasons.Midtemp);
            System.out.println(seasons.getDescription());
        }
    }

    public static void printSeasonDescription(Season season) {
        switch (season) {
            case Весна:
                System.out.println("Я люблю весну");
                break;
            case Лето:
                System.out.println("Я люблю лето");
                break;
            case Осень:
                System.out.println("Я люблю осень");
                break;
            case Зима:
                System.out.println("Я люблю зиму");
                break;
        }

    }

};


