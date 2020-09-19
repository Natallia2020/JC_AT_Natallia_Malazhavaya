package main.java.project.boxing;

import main.java.project.vessel.Bottle;
import main.java.project.vessel.Cup;
import main.java.project.vessel.Vessel;
import main.java.tasks.day5.B;
import main.java.tasks.day5.C;

import java.io.*;

public class Warehouse {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle();
        Bottle bottle2 = new Bottle();
        Bottle bottle3 = new Bottle();
        Bottle bottle4 = new Bottle();
        Bottle bottle5 = new Bottle();
        Bottle bottle6 = new Bottle();
        Bottle bottle7 = new Bottle();
        Bottle bottle8 = new Bottle();
        Bottle bottle9 = new Bottle();
        VesselBox<Bottle> containerWithBottles = new VesselBox<>(9);
        containerWithBottles.add(bottle1);
        containerWithBottles.add(bottle2);
        containerWithBottles.add(bottle3);
        containerWithBottles.add(bottle4);
        containerWithBottles.add(bottle5);
        containerWithBottles.add(bottle6);
        containerWithBottles.add(bottle7);
        containerWithBottles.add(bottle8);
        containerWithBottles.add(bottle9);
        Cup cup1 = new Cup();
        Cup cup2 = new Cup();
        Cup cup3 = new Cup();
        VesselBox<Cup> containerWithCups = new VesselBox<>(24);
        containerWithCups.add(cup1);
        containerWithCups.add(cup2);
        containerWithCups.add(cup3);
        System.out.println("VesselBoxBottle is" + " " + containerWithBottles);
        System.out.println("VesselBoxCup is" + " " + containerWithCups);
    }
}
