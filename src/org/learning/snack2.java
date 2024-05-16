package org.learning;

import java.util.Random;

public class snack2 {
    public static void main(String[] args) {
        Random random = new Random();

        String[] nameList = {"Luca", "Maria", "Giovanni", "Chiara", "Francesca"};
        String[] surnameList = {"Rossi", "Bianchi", "Verdi", "Neri", "Gialli"};

        for (int i = 0; i < 5; i++) {
            System.out.println(nameList[random.nextInt(0, nameList.length - 1)] + ' ' + surnameList[random.nextInt(0, surnameList.length - 1)]);
        }
    }
}
