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
            tax = revenue * 2.5;
        }
        else if (revenue <= 25000) {
            // 4.3% ставка
            tax = revenue * 4.3;
        }
        else {
            // 6,7% ставка
            tax = revenue * 6.7;
        }
        System.out.printf("The tax amount is: %.2f%n", tax);


        // закриваємо сканер
        sc.close();
    }
}