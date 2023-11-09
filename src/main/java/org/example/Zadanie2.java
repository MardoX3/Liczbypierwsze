package org.example;

public class Zadanie2 {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;

        while (count < 30) {
            if (isFirstNumber(num)) {
                System.out.print(num + ", ");
                count++;
            }
            num++;
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
