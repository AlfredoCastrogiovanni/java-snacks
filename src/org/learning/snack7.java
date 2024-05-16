package org.learning;

import java.util.Scanner;

public class Snack7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the seconds: ");
        int seconds = Integer.parseInt(scanner.nextLine());

        int hours = seconds / 3600;

        int minutes = (seconds % 3600) / 60;

        int remainingSeconds = seconds % 60;

        System.out.println(
                (hours < 10 ? String.format("0%s", hours) : hours) + ":" +
                (minutes < 10 ? String.format("0%s", minutes) : minutes) + ":" +
                (remainingSeconds < 10 ? String.format("0%s", remainingSeconds) : remainingSeconds)
            );

        scanner.close();
    }
}
