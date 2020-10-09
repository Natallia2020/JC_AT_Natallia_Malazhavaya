package main.java.tasks.day8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class QueueSpeed {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            queue.add("gfhdsg"+i);
        }
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            queue.remove();
        }
        System.out.println(System.currentTimeMillis() - time1);
        Set<String> hashSet = new HashSet<>();
        for (int i = 0; i < 1000000; i++) {
            hashSet.add("gfhdsg"+i);
        }
        long time2 = System.currentTimeMillis();
        for (int i = 0; i < hashSet.size(); i++) {
            hashSet.remove(i);
        }
        System.out.println(System.currentTimeMillis() - time1);
    }
}
