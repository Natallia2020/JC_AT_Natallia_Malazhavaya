package main.java.tasks.day8;

import java.util.*;

public class HashSetSplit {
    public static void main(String[] args) {
        String str = "мама азбука ножницы багет мама азбука ножницы багет";
        String[] strs = str.split(" ");
        Set<String> setList = new HashSet<>();
        for (int i = 0; i < strs.length; i++) {
            setList.add(strs[i]);
        }
        for (String temp:setList) {
            System.out.println((temp));
        }
        Iterator<String> iterator = setList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Set<String> aa = new TreeSet<>();
        for (int i = 0; i < strs.length; i++) {
            aa.add(strs[i]);
        }
        for (String temp:aa) {
            System.out.println((temp));
        }
        Set<String> setList2 = new HashSet<>();
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            setList.add("gfhdsg"+i);
        }
        System.out.println(System.currentTimeMillis() - time1);
        long time2 = System.currentTimeMillis();
        Iterator<String> iterator3 = setList2.iterator();
        while (iterator3.hasNext()) {
            iterator.next();
        }
        System.out.println(System.currentTimeMillis() - time2);
        Set<String> treeSetList = new TreeSet<>();
        long time3 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            treeSetList.add("hgfhdsg"+i);
        }
        System.out.println(System.currentTimeMillis() - time3);
        long time4 = System.currentTimeMillis();
        Iterator<String> iterator2 = treeSetList.iterator();
        while (iterator2.hasNext()) {
            iterator2.next();
        }
        System.out.println(System.currentTimeMillis() - time4);
    }
}
