package main.java.tasks.day9.lambda2;

public class Runner2 {
    public static void main(String[] args) {
        MyClass2 mc2 = new MyClass2();
        // 1 Way
//        mc2.justMethod2((x) -> System.out.println(x));
        //2 Way
        mc2.justMethod2(System.out::println);
    }
}
