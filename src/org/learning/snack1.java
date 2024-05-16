package org.learning;

import java.util.Scanner;

public class snack1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNumber;

        try {
            System.out.print("Enter a number: ");
            userNumber = Integer.parseInt(scanner.nextLine());

            System.out.println(userNumber % 2 == 0 ? userNumber : userNumber + 1);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number!");
        }

        scanner.close();
    }
}
