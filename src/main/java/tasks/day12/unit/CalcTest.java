package main.java.tasks.day12.unit;

public class CalcTest {
    Calc calc = new Calc();
    public void addTest() throws TestException {
       if (calc.add(2,3) != 5) {
           throw new TestException();
       } else {
           System.out.println("Test passed");
       }
    }
    public void substractTest() throws TestException {
        if (calc.substraction(2,3) != -1) {
            throw new TestException();
        } else {
            System.out.println("Test passed");
        }
    }
    public void multiplyTest() throws TestException {
        if (calc.multiply(2,3) != 6) {
            throw new TestException();
        } else {
            System.out.println("Test passed");
        }
    }
    public void divideTest() throws TestException {
        if (calc.divide(6,3) != 2) {
            throw new TestException();
        } else {
            System.out.println("Test passed");
        }
    }
}
