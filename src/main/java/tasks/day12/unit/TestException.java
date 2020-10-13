package main.java.tasks.day12.unit;

public class TestException extends Exception {
    public TestException() {
        super(("The result of the test is wrong"));
    }
}
