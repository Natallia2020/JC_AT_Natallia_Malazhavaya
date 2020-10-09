package main.java.tasks.day8;

import java.sql.Time;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSpeed {
    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            myList1.add("mama");
        }
        System.out.println(System.currentTimeMillis() - time1);
        long time2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            myList2.add("mama");
        }
        System.out.println(System.currentTimeMillis() - time2);
        long time3 = System.currentTimeMillis();
        for (int i = 0; i < myList1.size(); i++) {
            myList1.get(i);
        }
        System.out.println(System.currentTimeMillis() - time3);
        long time4 = System.currentTimeMillis();
        for (int i = 0; i < myList2.size(); i++) {
            myList2.get(i);
        }
        System.out.println(System.currentTimeMillis() - time4);
    }
}
