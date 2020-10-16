package main.java.project.vessel;

import main.java.project.material.Material;
import main.java.project.stuff.Bubble;
import main.java.project.stuff.SparklingWater;
import main.java.project.stuff.Transformable;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bottle extends Vessel implements Containable, Serializable {
    private double volume;
    private SparklingWater water;
    private Transformable stuff;
    private double diametr = 2.0;

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

    public Transformable getStuff() {
        return stuff;
    }

    public void setStuff(Transformable stuff) {
        this.stuff = stuff;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public Bottle(double volume, Material material, SparklingWater water) {
        super(volume, material);
        this.water = water;
//        List<Bubble> bubbles = new ArrayList<>();
//        for (int i = 0; i < volume*1000; i++) {
//            bubbles.add(new Bubble("CO2"));
//        }
        List<Bubble> bubbles = Stream.generate(() -> new Bubble("CO2")).limit((long) (volume * 1000)).collect(Collectors.toList());
        water.pump(bubbles);
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

    public void warm(int temperature) {
        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(60000);
                while (this.water.getTemperature() <= 40) {
                    int temperatureNew = this.water.getTemperature() + 1;
                    this.water.setTemperature(temperatureNew);
                    System.out.println("Temperature is set to: " + this.water.getTemperature());
                    Thread.sleep(60000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread2.start();
    }
}