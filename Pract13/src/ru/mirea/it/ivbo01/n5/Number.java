package ru.mirea.it.ivbo01.n5;
public class Number {
    public static void main(String[] args) {
        String[] numbers = {
                "89175655655",
                "+79175655655",
                "+104289652211"
        };

        for (String number: numbers){
            String reworked_string = number.substring(number.length() - 10);
            String init =  number.substring(0, number.length() - 10);
            if (init.startsWith("+")){
                init = init.substring(1);
            }
            if (init.startsWith("8")){
                init = "7" + init.substring(1);
            }
            System.out.println("+" + init + " " + reworked_string.substring(0, 3) + "-" + reworked_string.substring(3, 6) + "-" + reworked_string.substring(6));
        }

    }
}