package org.example;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą dodatnią: ");
        int number = scanner.nextInt();

        int primeFactorsCount = countPrimeFactors(number);

        System.out.println("Liczba czynników pierwszych: " + primeFactorsCount);
    }

    public static int countPrimeFactors(int number) {
        int count = 0;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && isFirstNumber(i)) {
                count++;
                while (number % i == 0) {
                    number /= i;
                }
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
