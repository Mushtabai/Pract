package ru.mirea.it.ivbo01.n2;

import java.util.Scanner;
public class Exception2 extends Object {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = -1;
        try {
            i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
        catch (NumberFormatException e) { // Exception e
            System.out.println("Number isn't an integer\n" + e);
        }
        /*catch (Exception e){
            System.out.println("General exception");
        }*/
        finally {
            myScanner.close();
            System.out.println("After exceptions");
        }
    }

}
