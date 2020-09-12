package main.java.project.state;

public class Bubble {
    private double volume = 0.3;
    private String gas;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public Bubble(String gas) {
        this.gas = gas;
    }

    public void cramp() {
        System.out.println("Cramping the bubbles");
        System.out.println("Cramp!");
    }
}
