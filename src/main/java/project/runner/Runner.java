package main.java.project.runner;

import main.java.project.vessel.Bottle;
import main.java.project.material.Plastic;
import main.java.project.state.SparklingWater;

public class Runner {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle(1.5,15, 1500, new Plastic(0.2,"transparent", 1.2), new SparklingWater(), 5, true);
        Bottle bottle2 = new Bottle(1.5,15, 1500, new Plastic(0.1,"grey", 0.95), new SparklingWater(),22, false);
        System.out.println("Opening the bottle №1");
        bottle1.open();
        System.out.println("Opening the bottle №2");
        bottle2.open();
    }
}
