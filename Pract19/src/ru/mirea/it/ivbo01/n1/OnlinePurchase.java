package ru.mirea.it.ivbo01.n1;

public class OnlinePurchase {
    public static boolean isValidINN(String inn) {
        return inn.length() == 10;
    }

    public void placeOrder(String fullName, String inn) throws InvalidINNException {
        if (!isValidINN(inn)) {
            throw new InvalidINNException("Недействительный номер ИНН: " + inn);
        }
        System.out.println("Заказ оформлен для: " + fullName);
    }

    public static void main(String[] args) {
        OnlinePurchase onlinePurchase = new OnlinePurchase();
        String fullName = "Иванов Иван Иванович";
        String invalidINN = "12345";
        String validINN = "1234567890";

        try {
            onlinePurchase.placeOrder(fullName, invalidINN);
        } catch (InvalidINNException e) {
            System.out.println("Ошибка при оформлении заказа: " + e.getMessage());
        }

        try {
            onlinePurchase.placeOrder(fullName, validINN);
        } catch (InvalidINNException e) {
            System.out.println("Ошибка при оформлении заказа: " + e.getMessage());
        }
    }
}