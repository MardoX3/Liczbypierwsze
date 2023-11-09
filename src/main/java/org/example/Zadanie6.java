package org.example;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą dodatnią: ");
        int number = scanner.nextInt();

        System.out.println("Najmniejsza liczba pierwsza większa od " + number + findNextPrime(number));
    }
    private static int findNextPrime(int num) {
        while (true) {
            num++;
            if (isFirstNumber(num)) {
                return num;
            }
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
