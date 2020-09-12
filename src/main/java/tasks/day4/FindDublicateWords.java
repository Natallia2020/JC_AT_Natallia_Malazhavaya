package main.java.tasks.day4;

import java.util.Scanner;

public class FindDublicateWords {
    public static void main(String[] args) {
        System.out.println("Enter any text, please");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    System.out.println(words[j]);
                }
            }
        }
    }
}
