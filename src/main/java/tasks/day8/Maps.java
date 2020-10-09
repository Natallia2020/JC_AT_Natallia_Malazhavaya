package main.java.tasks.day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {
        String str = "Мама мыла раму мыла";
        String[] strs = str.split(" ");
        Map<Integer, String> words = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            words.put(i, strs[i]);
        }
        System.out.println(words.keySet());
        System.out.println(words.values());
        Set<Map.Entry<Integer,String>> set = words.entrySet();
        for (Map.Entry<Integer,String> temp : set) {
            System.out.println(temp.getKey() + " " + temp.getValue());
        }
    }
}
