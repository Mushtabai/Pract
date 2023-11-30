package ru.mirea.it.ivbo01;

public class TesterShape {
    public static void main(String[] args){

        Shape sh = new Shape();
        Circle C = new Circle(3);
        Rectangle R = new Rectangle(4,3);
        Square S = new Square(5);
       System.out.println(sh.getType());
        System.out.println(sh.toString());
        System.out.println(C.getType());
        System.out.println(C.toString());
        System.out.println( R.getType());
        System.out.println(R.toString());
        System.out.println(S.getType());
        System.out.println(S.toString());
    }
}
