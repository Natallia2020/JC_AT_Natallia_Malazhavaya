package main.java.project.vessel;

import main.java.project.material.Material;
import main.java.project.stuff.Bubble;
import main.java.project.stuff.SparklingWater;
import main.java.project.stuff.Transformable;
import main.java.project.stuff.Water;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bottle extends Vessel implements Containable, Serializable {
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

    public Bottle(double volume, double diameter, int weight, Material material, SparklingWater water, boolean warmBottle) {
        super(volume, diameter, weight, material);
        this.water = water;
//        List<Bubble> bubbles = new ArrayList<>();
//        for (int i = 0; i < volume*1000; i++) {
//            bubbles.add(new Bubble("CO2"));
//        }
        List<Bubble> bubbles = Stream.generate(() -> new Bubble("CO2")).limit((long) (volume*1000)).collect(Collectors.toList());
        water.pump(bubbles);
        if (warmBottle == true) {
            warm(this.water.getTemperature());
        }
    }

    public Bottle() {

    }


    @Override
    public void addStuff(Transformable stuff) {

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
        System.out.println("Bottle is opened");
        this.water.setOpened(true);
    }

    @Override
    public void close() {

    }

    public void warm(double temperature) {
        System.out.println("Warming water");
            try {
                while (this.water.getTemperature() <= 40) {
                temperature = this.water.getTemperature() + 0.1;
                this.water.setTemperature(temperature);
                Thread.sleep(60000);}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

