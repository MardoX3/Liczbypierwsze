package org.example;

public class Zadanie10 {
    public static void main(String[] args) {
        int count = 0;
        int p = 2;

        System.out.println("Pięć początkowych liczb doskonałych:");

        while (count < 5) {
            long mersenne = (1 << p) - 1;

            if (isFirstNumber(mersenne)) {
                long perfectNumber = (1 << (p - 1)) * mersenne;
                System.out.println(perfectNumber);
                count++;
            }

            p++;
        }
    }

    public static boolean isFirstNumber(long number) {
        if (number > 1) {
            if (number > 2 && number % 2 == 0) return false;
            if (number > 3 && number % 3 == 0) return false;
            for (long d = 5; d * d <= number; d += 6) {
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
