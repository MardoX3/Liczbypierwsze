package org.example;

public class Zadanie11 {
    public static void main(String[] args) {
        System.out.println("Hipoteza Goldbacha dla liczb parzystych od 2 do 100:");

        for (int evenNumber = 4; evenNumber <= 100; evenNumber += 2) {
            checkGoldbachConjecture(evenNumber);
        }
    }

    private static void checkGoldbachConjecture(int evenNumber) {
        System.out.print(evenNumber + " = ");

        boolean found = false;

        for (int i = 2; i <= evenNumber / 2; i++) {
            if (isFirstNumberSigma(i) && isFirstNumberSigma(evenNumber - i)) {
                System.out.print(i + " + " + (evenNumber - i) + "  ");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Hipoteza Goldbacha nie spełniona!");
        } else {
            System.out.println();
        }
    }

    public static boolean isFirstNumberSigma(int number) {
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
