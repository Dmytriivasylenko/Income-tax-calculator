package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Створення Scanner

        Scanner sc = new Scanner(System.in);

        // Дані, що вводяться користувачем

        System.out.print("Please enter the amount of revenue: ");

        // Отримання int через Scanner.nextInt()
        int revenue = sc.nextInt();

        double tax;

        if (revenue < 1000) {
            //2.5% ставка
            tax = revenue * 0.025;
        }
        else if (revenue <= 25000) {
            // 4.3% ставка
            tax = revenue * 0.043;
        }
        else {
            // 6,7% ставка
            tax = revenue * 0.067;
        }
        System.out.println("The tax amount is: " + tax);

        // закриваємо сканер
        sc.close();
    }
}