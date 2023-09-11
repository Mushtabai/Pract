package ru.mirea.it.ivbo01;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static int fact ( int a){
        if (a == 0)
            return 1;
        else
            return  fact(a-1) *a;
    }
    public static void main(String[] args) {

        int[] midsum =  {1,2,5,6,3,7};
        int sum = 0;
        for(int i = 0; i!= midsum.length;i++){
            sum += midsum[i];
        }
        System.out.println("Sum: "+ sum);
        System.out.println("Arithmetic mean: "+ sum/midsum.length);
        //Практ 1 пункт 3
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String strArr[] = str.split(" ");
        int i = 0, summ = 0, max,min;
        int num[] = new int[strArr.length];
        while ( i < strArr.length) {
            num[i] = Integer.parseInt(strArr[i]);
            summ += num[i];
            i++;
        }
        max = num[i-1];
        min = num[i-1];
        while(i!=0)
        {
            i--;
            if(max < num[i])
                max = num[i];
            if(min > num[i])
                min = num[i];
        }
        System.out.println("Sum: "+ sum +"  Min: " + min + " Max: " + max);
        //Практ 1 пункт 4

        for (int il = 0; il < args.length; il++) {
            System.out.println(args[il] + " ");
        }
        //Практ 1 пункт 5
        DecimalFormat decimalFormat = new DecimalFormat( "#.###" );
        for (int ik = 1; ik < 11; ik++) {
            String result = decimalFormat.format(1./ik);
            System.out.println(result);
        }
        //Практ 1 пункт 6
        System.out.println(fact(4));
        //Практ 1 пункт 7
    }
}
