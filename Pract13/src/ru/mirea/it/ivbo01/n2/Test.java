package ru.mirea.it.ivbo01.n2;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", "Michael");
        Person person2 = new Person("Alice", "Smith", null);
        Person person3 = new Person(null, "Bob", null);

        System.out.println("Person 1: " + person1.getFullName());
        System.out.println("Person 2: " + person2.getFullName());
        System.out.println("Person 3: " + person3.getFullName());
    }
}