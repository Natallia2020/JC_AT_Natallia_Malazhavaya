package main.java.tasks.day7;

public class ColorRunner {
    public static void main(String[] args) {
        ColorChoice colorChoice1 = new ColorChoice();
        colorChoice1.getColor1(ColorContainer.BLUE.getColorString());
        colorChoice1.getColor2(ColorContainer.BLUE.getColorInt());
        Color c1 = new Color ("red", 4);
        Color c2 = new Color ("red", 4);
        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}
