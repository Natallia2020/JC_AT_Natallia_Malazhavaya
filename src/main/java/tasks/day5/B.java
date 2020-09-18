package main.java.tasks.day5;

import org.w3c.dom.ls.LSOutput;

public class B {
    public static void main(String[] args) {
        A c = new C();
        c.foo(5);
        A a2 = new A() {
            public int foo(int x) {
                int y = x * 5;
                System.out.println(y);
                return y;
            }
        };
        a2.foo(5);
    }
}
