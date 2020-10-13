package main.java.tasks.day12.thread;

import java.util.concurrent.atomic.AtomicLong;

public class ThreadDay123 {
    public static void main(String[] args) throws InterruptedException {
        long l1 = System.currentTimeMillis();
        AtomicLong co = new AtomicLong();
        Thread t1 = new Thread(() -> {
                for (int j = 0; j < 1000000; j++) {
                    co.incrementAndGet();
                }
        });
        Thread t2 = new Thread(() -> {
                for (int j = 0; j < 1000000; j++) {
                    co.decrementAndGet();
                }
        });
        t1.start();
        t2.start();
        t2.join();
        Thread.sleep(100);
        System.out.println(System.currentTimeMillis() - l1);
    }
}
