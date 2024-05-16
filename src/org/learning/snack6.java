package org.learning;

import java.util.Scanner;

public class snack6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean convertible = true;
        int numberInteger = 0;

        System.out.println("Enter a string to convert: ");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            int digit = 0;

            switch (str.charAt(i)) {
                case '0': digit = 0; break;
                case '1': digit = 1; break;
                case '2': digit = 2; break;
                case '3': digit = 3; break;
                case '4': digit = 4; break;
                case '5': digit = 5; break;
                case '6': digit = 6; break;
                case '7': digit = 7; break;
                case '8': digit = 8; break;
                case '9': digit = 9; break;
                default:
                    digit = -1;
                    break;
            }

            if (digit != -1) {
                numberInteger = numberInteger * 10 + digit;
            } else {
                convertible = false;
                break;
            }
        }

        System.out.println(convertible ? numberInteger : "Not convertible");

        scanner.close();
    }
}
