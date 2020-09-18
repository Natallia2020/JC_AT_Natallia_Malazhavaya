package main.java.tasks.day6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadMe {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\JAVA\\CoursesYS\\HWnew\\src\\main\\java\\tasks\\day6\\ReadMe.txt" ));
            String result1 = bufferedReader.readLine();
            ArrayList<Integer> list1 = new ArrayList();
            System.out.println("Text from file:");
            while (result1 != null) {
                String[] words = result1.trim().split("[\\.\\,\\s,\\...\\!\\?\\—\\:\\;]+");
                int numberWords = words.length;
                System.out.println(result1);
                result1 = bufferedReader.readLine();
                list1.add(numberWords);
            }
            int sum = 0;
            for (int i = 0; i < list1.size(); i++) {
                sum += list1.get(i);
            }
            System.out.println("Number of words in the text = " + " " + sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader("C:\\JAVA\\CoursesYS\\HWnew\\src\\main\\java\\tasks\\day6\\ReadMe.txt" ));
            String result2 = bufferedReader2.readLine();
            ArrayList <Integer> list2 = new ArrayList();

            while (result2 != null) {
                int before = result2.length();
                int after = result2.replaceAll("[\\.\\,\\...\\!\\?\\—\\:\\;]+", "").length();
                int a = before-after;
                result2 = bufferedReader2.readLine();
                list2.add(a);
            }
            int sum2 = 0;
            for (int i = 0; i < list2.size(); i++) {
                sum2 += list2.get(i);
            }
            System.out.println("Number of punctuation marks in the text = " + " " + sum2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
