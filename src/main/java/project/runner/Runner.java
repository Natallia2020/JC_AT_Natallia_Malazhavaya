package main.java.project.runner;

import main.java.project.vessel.Bottle;
import main.java.project.material.Plastic;
import main.java.project.stuff.SparklingWater;
import main.java.project.vessel.Cup;
import main.java.project.warehouse.Stocktaking;
import main.java.project.warehouse.VesselBox;
import main.java.project.warehouse.Warehouse;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
//        Bottle bottle1 = new Bottle(1.5,15, 1500,
//        new Plastic(0.2,"transparent", 1.2),
//        new SparklingWater("no","transparent","no",5),
//        true);
        Bottle bottle2 = new Bottle(1.5,15, 1500,
                new Plastic(0.1,"grey", 0.95),
                new SparklingWater("no","transparent","no", 22),
                false);
//        System.out.println("Opening the bottle №1");
//        bottle1.open();
        System.out.println("Opening the bottle №2");
        bottle2.open();
        Warehouse warehouse = new Warehouse();
        Stocktaking stocktaking = new Stocktaking();
        VesselBox <Bottle> vesselBoxWithBottles = new VesselBox<>(9);
        vesselBoxWithBottles = warehouse.createVesselBoxWithBottles(9);
        VesselBox <Cup> vesselBoxWithCups = new VesselBox<>(24);
        vesselBoxWithCups = warehouse.createVesselBoxWithCups(24);
        stocktaking.stocktaking(vesselBoxWithBottles);
        stocktaking.stocktaking(vesselBoxWithCups);
    }
}
