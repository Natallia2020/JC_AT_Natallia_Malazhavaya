package main.java.project.stuff;

public class Bubble {
    public static final double VOLUME = 0.3;
    private String gas;

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
        System.out.println("Cramp!");
    }
}
