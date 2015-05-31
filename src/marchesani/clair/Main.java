package marchesani.clair;

// This software reports the sum of all the multiples of 3 or 5 below 1000

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i <= 333; i++) {
            sum += i * 3;
        }
        for (int i = 0; i < 200; i++) {
            if ((i * 5) % 3 != 0) sum += i * 5;
        }
        System.out.println("The result is " + sum);
    }
}
