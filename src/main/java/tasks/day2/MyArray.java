package main.java.tasks.day2;

import java.util.Random;

public class MyArray {
    public static void main(String[] args) {
        int i = -1;
        System.out.println("Numbers from 0 to 20:");
        while (i < 20) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println("\n" + "Odd numbers from 3 to 19:");
        for (int j = 3; j <= 19; j++) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println("\n" + "Array:");
        Random random = new Random();
        int[] myArray = new int[7];
        for (int k = 0; k < myArray.length; k++) {
            myArray[k] = random.nextInt(50);
        }
        for (int k = 0; k < myArray.length; k++) {
            System.out.print(myArray[k] + " ");
        }
        System.out.println("\n" + "Reverse Array:");
        int temp;
        for (int k = 0; k < myArray.length / 2; k++) {
            temp = myArray[myArray.length - k - 1];
            myArray[myArray.length - k - 1] = myArray[k];
            myArray [k] = temp;
        }
        for (int k = 0; k < myArray.length; k++) {
            System.out.print(myArray[k] + " ");
        }
        System.out.println("\n" + "Array*5:");
        for (int k = 0; k < myArray.length; k++) {
            myArray[k] = myArray[k]*5;
            System.out.print(myArray[k] + " ");
        }
        System.out.println("\n" + "Array^2:");
        for (int k = 0; k < myArray.length; k++) {
            myArray[k] = (int)Math.pow(myArray[k],2);
            System.out.print(myArray[k] + " ");
        }
        System.out.println("\n" + "Min element:");
        int min = myArray[0];
        for (int k = 0; k < myArray.length; k++) {
            if (myArray[k]<min) {
                min = myArray[k];
            }
        }
        System.out.print(min + " ");
        System.out.println("\n" + "Changing first element and last element:");
        int temp2;
        for (int k = 0; k < 1; k++) {
            temp2 = myArray[myArray.length - k - 1];
            myArray[myArray.length - k - 1] = myArray[k];
            myArray [k] = temp2;
        }
        for (int k = 0; k < myArray.length; k++) {
            System.out.print(myArray[k] + " ");
        }
//        System.out.println("\n" + "Descending sort Way№1:");
//        Arrays.sort(myArray);
//        for (int k = 0; k < myArray.length; k++) {
//            System.out.print(myArray[k] + " ");
//        }
        System.out.println("\n" + "Descending sort Way№2:");
        for (int s = 0; s < myArray.length; s++) {
            for (int h = 0; h < myArray.length - 1; h++) {
                if (myArray[h + 1] < myArray[h]) {
                    int temp3 = myArray[h + 1];
                    myArray[h + 1] = myArray[h];
                    myArray[h] = temp3;
                }
            }
        }
        for (int g = 0; g < myArray.length; g++) {
            System.out.print(myArray[g] + " ");
        }
    }

}
