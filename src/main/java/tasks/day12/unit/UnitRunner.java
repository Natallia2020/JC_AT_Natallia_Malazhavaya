package main.java.tasks.day12.unit;

public class UnitRunner {
    public static void main(String[] args) throws TestException {
        CalcTest calcTest = new CalcTest();
        calcTest.addTest();
        calcTest.substractTest();
        calcTest.multiplyTest();
        calcTest.divideTest();
    }
}
