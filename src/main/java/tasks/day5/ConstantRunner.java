package main.java.tasks.day5;

import java.lang.invoke.SwitchPoint;

public class ConstantRunner {
    public static void color(String color) {
        switch (color) {
            case ConstantContainer.BLUE:
                System.out.println("This color is blue" );
                break;
            case ConstantContainer.GREEN:
                System.out.println("This color is green");
                break;
            case ConstantContainer.PURPLE:
                System.out.println("This color is purple");
                break;
            case ConstantContainer.RED:
                System.out.println("This color is red");
                break;
            case ConstantContainer.YELLOW:
                System.out.println("This color is yellow");
                break;
        }
    }

    public static void main(String[] args) {
    color("red");
    }
}
