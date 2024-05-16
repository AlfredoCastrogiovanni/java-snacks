package org.learning;

public class Snack3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sum += array[i];
            }
        }

        System.out.println(sum);
    }
}
