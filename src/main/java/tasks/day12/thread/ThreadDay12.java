package main.java.tasks.day12.thread;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;

public class ThreadDay12 {
    static long i = 0;
    public static void main(String[] args) throws InterruptedException {
//        Object lock = new Object();
        long l1 = System.currentTimeMillis();
//        Map<Integer,Integer> map = new ConcurrentHashMap<>();
        Map<Integer,Integer> map = Collections.synchronizedMap(new HashMap<>());
        Thread t1 = new Thread(() -> {
//            synchronized (lock) {
            for (int j = 0; j < 10000; j++) {
                map.put(j,j);
            }
//            }
    });
        Thread t2 = new Thread(() -> {
//            synchronized (lock) {
//            Set<Map.Entry<Integer,Integer>> set = map.entrySet();
//            int values = 0;
//            for (Map.Entry<Integer,Integer> temp : set) {
//                values = values + temp.getKey();
//                System.out.println(values);
//            }
                for (int j = 0; j < 10000; j++) {
                    map.forEach((k,v) -> i += v);
                }
                System.out.println(i);
//        }
    });
        t1.start();
        t2.start();
        t2.join();
        Thread.sleep(100);
        System.out.println(System.currentTimeMillis() - l1);
}
}
