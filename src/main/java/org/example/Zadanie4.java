package org.example;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą dodatnią: ");
        int number = scanner.nextInt();

        if (isSemiprime(number)) {
            System.out.println("TAK, liczba " + number + " jest liczbą półpierwszą.");
        } else {
            System.out.println("NIE, liczba " + number + " nie jest liczbą półpierwszą.");
        }
    }

    private static boolean isSemiprime(int num) {
        int count = 0;

        for (int i = 2; count < 2 && i * i <= num; i++) {
            while (num % i == 0) {
                num /= i;
                count++;
            }
        }

        if (num > 1) {
            count++;
        }

        return count == 2;
    }
}
