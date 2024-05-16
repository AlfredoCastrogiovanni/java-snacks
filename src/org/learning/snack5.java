package org.learning;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        int letterIndex = 0;
        int digitIndex = 0;
        int symbolIndex = 0;

        if (str.charAt(0) != 0) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))) {
                    letterIndex++;
                } else if (Character.isDigit(str.charAt(i))) {
                    digitIndex++;
                } else {
                    symbolIndex++;
                }
            }
        }

        System.out.println("Number of letter: " + letterIndex);
        System.out.println("Number of digit: " + digitIndex);
        System.out.println("Number of symbol: " + symbolIndex);

        scanner.close();
    }
}
