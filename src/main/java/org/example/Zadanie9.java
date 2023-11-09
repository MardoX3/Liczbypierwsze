package org.example;

public class Zadanie9 {
    public static void main(String[] args) {
        int count = 0;
        int number1 = 220;

        System.out.println("Trzy początkowe pary liczb zaprzyjaźnionych:");

        while (count < 3) {
            int number2 = calculateFriendlyNumber(number1);

            if (number2 > number1 && calculateSumOfDivisors(number1) == number2 && calculateSumOfDivisors(number2) == number1) {
                System.out.println("(" + number1 + ", " + number2 + ")");
                count++;
            }

            number1++;
        }
    }

    private static int calculateSumOfDivisors(int num) {
        int sum = 1;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    private static int calculateFriendlyNumber(int num) {
        return calculateSumOfDivisors(num);
    }
}
