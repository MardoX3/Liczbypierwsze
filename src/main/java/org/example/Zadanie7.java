package org.example;

public class Zadanie7 {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        System.out.println("Cztery początkowe liczby doskonałe:");

        while (count < 4) {
            if (isPerfectNumber(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    private static boolean isPerfectNumber(int num) {
        int sum = 1;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }
}
