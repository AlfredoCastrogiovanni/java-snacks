package org.learning;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 2;
        int primeCounter = 0;

        while (true) {
            boolean primeNumber = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) primeNumber = false;
            }

            if (primeNumber) primeCounter++;

            if (primeCounter == 1000) {
                System.out.println(number);
                break;
            }

            number++;
        }
    }
}
