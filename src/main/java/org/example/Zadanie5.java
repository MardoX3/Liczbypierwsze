package org.example;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą dodatnią: ");
        int number = scanner.nextInt();

        System.out.println("Liczba różnych czynników pierwszych dla liczby " + number + " to: " + countUniquePrimeFactors(number));
    }

    private static int countUniquePrimeFactors(int num) {
        int count = 0;
        int lastFactor = 0;

        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                if (isFirstNumber(i) && i != lastFactor) {
                    count++;
                    lastFactor = i;
                }
                num /= i;
            }
        }

        return count;
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