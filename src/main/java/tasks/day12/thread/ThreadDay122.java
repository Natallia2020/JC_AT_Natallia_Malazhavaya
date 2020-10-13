package main.java.tasks.day12.thread;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ThreadDay122 {
    static long value = 0;
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        long l1 = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                for (int j = 0; j < 1000000; j++) {
                    value = value++;
                }
                System.out.println(value);
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                for (int j = 0; j < 1000000; j++) {
                    value = value--;
                }
                System.out.println(value);
            }
        });
        t1.start();
        t2.start();
        t2.join();
        Thread.sleep(100);
        System.out.println(System.currentTimeMillis() - l1);
    }
}
