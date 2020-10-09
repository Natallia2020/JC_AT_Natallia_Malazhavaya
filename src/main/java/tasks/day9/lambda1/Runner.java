package main.java.tasks.day9.lambda1;

public class Runner {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.justMethod(() -> 3.14);
    }
}
