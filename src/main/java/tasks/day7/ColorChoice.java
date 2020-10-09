package main.java.tasks.day7;

import main.java.tasks.day5.ConstantContainer;

public class ColorChoice {
    public void getColor1 (String color) {
        switch (color) {
            case "blue":
                System.out.println("This color is blue" );
                break;
            case "green":
                System.out.println("This color is green");
                break;
            case "purple":
                System.out.println("This color is purple");
                break;
            case "red":
                System.out.println("This color is red");
                break;
            case "yellow":
                System.out.println("This color is yellow");
                break;
        }
    }
    public void getColor2 (int color) {
        switch (color) {
            case 1:
                System.out.println("This color is blue" );
                break;
            case 2:
                System.out.println("This color is green");
                break;
            case 3:
                System.out.println("This color is purple");
                break;
            case 4:
                System.out.println("This color is red");
                break;
            case 5:
                System.out.println("This color is yellow");
                break;
        }
    }
}
