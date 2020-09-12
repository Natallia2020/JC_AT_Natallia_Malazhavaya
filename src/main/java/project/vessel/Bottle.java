package main.java.project.vessel;

import main.java.project.material.Material;
import main.java.project.state.Bubble;
import main.java.project.state.SparklingWater;
import main.java.project.state.Water;

public class Bottle extends Vessel implements Containable {
    private double volume;
    private SparklingWater water;
    boolean warmBottle;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public SparklingWater getWater() {
        return water;
    }

    public void setWater(SparklingWater water) {
        this.water = water;
    }

    public boolean getWarmBottle() {
        return warmBottle;
    }

    public void setWarmBottle(boolean warmBottle) {
        this.warmBottle = warmBottle;
    }

    public Bottle(double volume, double diameter, int weight, Material material, SparklingWater water, int temperature, boolean warmBottle) {
        super(volume, diameter, weight, material);
        this.water = water;
        this.water.setTemperature(temperature);
        Bubble[] bubbles = new Bubble[(int) volume * 1000];
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("CO2");
        }
        water.pump(bubbles);
        if (warmBottle == true) {
            warm(temperature);
        }
    }

    @Override
    public void addStuff(Transformable stuff) {
        Water water1 = new Water() {
            @Override
            public void mix() {

            }
        };
    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }

    public void open() {
        System.out.println("Opening the bottle");
        this.water.setOpened(true);
    }

    @Override
    public void close() {

    }

    public void warm(double temperature) {
        System.out.println(String.format("Warming water to:%s",temperature));
        for (double i = temperature; i <= 40; temperature = temperature + 0.1) {
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
