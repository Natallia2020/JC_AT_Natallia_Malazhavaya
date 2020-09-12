package main.java.tasks.day4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNumbersFromText {
    public static void main(String[] args) {
        System.out.println("Enter any text, please");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

//        Pattern p = Pattern.compile("\\d+");
//        Matcher m = p.matcher(text);
//
//        while (m.find()) {
//            String newText = m.group();
//            int num = Integer.parseInt(newText);
//            ArrayList <Integer> myArray = new ArrayList();
//            myArray.add(num);
//            for (Integer temp :myArray) {
//                System.out.println(temp);
//
//            }
//        }

        String newText = text.replaceAll("[^\\d+]", "");
        newText = newText.replaceAll(".(?!$)", "$0 ");
        String[] myArray = newText.trim().split(" ");
        int[] myArrayNew = new int[myArray.length];
        for (int j = 0; j < myArray.length; j++) {
            myArrayNew[j] = Integer.parseInt(myArray[j]);
        }
        for (int i = 0; i < myArrayNew.length; i++) {
            System.out.println(myArrayNew[i]);
        }
    }
}
