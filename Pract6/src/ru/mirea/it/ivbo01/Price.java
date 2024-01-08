package ru.mirea.it.ivbo01;

import java.security.SecureRandom;

public class Price {
    public static int generateRandom(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        SecureRandom random = new SecureRandom();
        byte[] bytes = random.generateSeed(20);
        random.nextBytes(bytes);
        return random.nextInt(n + 1);
    }

    interface Priceable {
        void getPrice();
    }

    class Shoes implements Priceable {
        public void getPrice() {
            System.out.println(" Shoes price is " + (10 + generateRandom(5)) + "$");
        }
    }

    class Telephone implements Priceable {
        public void getPrice() {
            System.out.println(" Telephone price is " + (20 + generateRandom(5)) + "$");
        }
    }

    class Laptop implements Priceable {
        public void getPrice() {
            System.out.println(" Laptop price is " + (500 + generateRandom(200)) + "$");
        }
    }

    class Car implements Priceable {
        public void getPrice() {
            System.out.println(" Car price is " + (8000 + generateRandom(2000)) + "$");
        }
    }

    public static void main(String[] args) {

    }
}
