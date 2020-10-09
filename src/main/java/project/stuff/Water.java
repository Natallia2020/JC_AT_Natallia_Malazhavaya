package main.java.project.stuff;

public abstract class Water implements Transformable {
    private String color = "no";
    private String transparency = "transparent";
    private String smell = "no";
    private double temperature = 0;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransparency() {
        return transparency;
    }

    public void setTransparency(String transparency) {
        this.transparency = transparency;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Water() {}

    public Water(String color, String transparency, String smell, double temperature) {
        this.color = color;
        this.transparency = transparency;
        this.smell = smell;
        this.temperature = temperature;
    }
}
