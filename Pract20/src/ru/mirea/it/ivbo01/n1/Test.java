package ru.mirea.it.ivbo01.n1;

public class Test {
    public static void main(String[] args) {
        ThreeGenericParams<Integer, String, Double> object = new ThreeGenericParams<>(52, "Hello", 3.1);
        object.printClassNames();
    }
}