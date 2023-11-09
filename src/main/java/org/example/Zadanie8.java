package org.example;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą dodatnią: ");
        int number = scanner.nextInt();

        System.out.println("Czynniki pierwsze liczby " + number + ":");

        factorize(number);
    }

    private static void factorize(int num) {
        while (num % 2 == 0) {
            System.out.println(2);
            num /= 2;
        }

        for (int i = 3; i * i <= num; i += 2) {
            while (num % i == 0 && isFirstNumber(i)) {
                System.out.println(i);
                num /= i;
            }
            while (num % (i + 2) == 0 && isFirstNumber(i + 2)) {
                System.out.println(i + 2);
                num /= i + 2;
            }
        }

        if (num > 2 && isFirstNumber(num)) {
            System.out.println(num);
        }
    }

    public static boolean isFirstNumber(int number) {
        if (number > 1) {
            if (number > 2 && number % 2 == 0) return false;
            if (number > 3 && number % 3 == 0) return false;
            for (int d = 5; d * d <= number; d += 6) {
                if (number % d == 0)
                    return false;
                if (number % (d + 2) == 0)
                    return false;
            }
            return true;
        } else
            return false;
    }
}
