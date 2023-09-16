package ru.mirea.it.ivbo01;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class One {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите размер массива 1 для создания элементов c помощью класса Random");
        int Size1 = scanner.nextInt();
        System.out.println("Введите размер массива 2 для создания элементов методом random классф Math");
        int Size2 = scanner.nextInt();
        int Arr1[] = new int[Size1];
        double Arr2[] = new double[Size2];
        for(int i =0;i != Size1; i++)
            Arr1[i] = rand.nextInt(1000);
        for(int i =0;i != Size2; i++)
            Arr2[i] = Math.random();
        System.out.println("Массив 1" + Arrays.toString(Arr1));
        System.out.println("Массив 2" + Arrays.toString(Arr2));
        Arrays.sort(Arr1);
        Arrays.sort(Arr2);
        System.out.println("Отсортированный массив 1" + Arrays.toString(Arr1));
        System.out.println("Отсортированный массив 2" + Arrays.toString(Arr2));
    }
}
