package main.java.project.runner;

import main.java.project.material.Material;
import main.java.project.stuff.SparklingWater;
import main.java.project.vessel.Bottle;
import main.java.project.vessel.Can;
import main.java.project.vessel.Cup;
import main.java.project.warehouse.Factory;
import main.java.project.warehouse.Stocktaking;
import main.java.project.warehouse.VesselBox;
import main.java.project.warehouse.Warehouse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Runner {
    public static void main(String[] args) throws IOException {
        SparklingWater sparklingWater1 = new SparklingWater();
        sparklingWater1.setTemperature(5);
        SparklingWater sparklingWater2 = new SparklingWater();
        sparklingWater2.setTemperature(22);
        Bottle bottle1 = new Bottle(1.5,
                                    Material.PLASTIC,
                                    sparklingWater1);
        Bottle bottle2 = new Bottle(1.5,
                                    Material.PLASTIC,
                                    sparklingWater2);
        System.out.println("Opening the bottle №1");
        bottle1.open();
        bottle1.warm(bottle1.getWater().getTemperature());
        System.out.println("Opening the bottle №2");
        bottle2.open();

        List<Bottle> listOfBottles = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            listOfBottles.add(new Bottle());
        }

        Stocktaking.deletingInformationFromFile();
        VesselBox box1 = new VesselBox("box1", listOfBottles);
        Stocktaking.registerBox(box1);
        VesselBox box2 = new VesselBox("box2", listOfBottles);
        Stocktaking.registerBox(box2);
        VesselBox box3 = new VesselBox("box3", listOfBottles);
        Stocktaking.registerBox(box3);
        Stocktaking.getInfo();
        Stocktaking.disposeBox(box1);
        Stocktaking.getInfo();
        Warehouse warehouse = new Warehouse();
        warehouse.addBox(box2);
        warehouse.addBox(box3);
        Set<Map.Entry<Integer,VesselBox>> set = warehouse.getStock().entrySet();
        System.out.println("State of the Warehouse:");
        for (Map.Entry<Integer,VesselBox> temp : set) {
            System.out.println(temp.getKey() + " " + temp.getValue().getName());
        }

    }
}
