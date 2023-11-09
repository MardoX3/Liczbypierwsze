package org.example;

public class Zadanie1 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (isFirstNumber(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    public static boolean isFirstNumber(int number){
        if(number>1){

            if(number > 2 && number % 2 == 0) return false;
            if(number > 3 && number % 3 == 0) return false;
            for(int d = 5;d*d<=number;d+=6){
                if(number % d == 0)
                    return false;
                if(number % (d+2) == 0)
                    return false;
            }
            return true;
        }
        else
            return false;

        }
    }
