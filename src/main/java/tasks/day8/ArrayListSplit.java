package main.java.tasks.day8;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSplit {
    public static void main(String[] args) {
        String str = "Мама мыла раму мыла";
        String[] strs = str.split(" ");
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            arrayList.add(strs[i]);
        }
        for (String temp:arrayList) {
            System.out.println((temp));
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("Remember!!!!!!!!!!!!!!!!!!!");
        Arrays.asList("мама мыла раму мыла".split(" ")).forEach(System.out::println);
    }
}
