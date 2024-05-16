package org.learning;

import java.util.Scanner;

public class snack4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean palindrome = true;

        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        int j = 0;
        for (int i = str.length() - 1; i >= 0; i--, j++) {
            if (str.charAt(i) != str.charAt(j)) {
                palindrome = false;
            }
        }

        System.out.println(palindrome ? "The word is palindrome" : "The word isn't palindrome");

        scanner.close();
    }
}