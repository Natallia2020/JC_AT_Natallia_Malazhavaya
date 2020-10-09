package main.java.project.warehouse;

import main.java.project.vessel.Bottle;
import main.java.project.vessel.Cup;
import main.java.project.vessel.Vessel;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    public VesselBox<Bottle> createVesselBoxWithBottles(int numberOfBottles) {
        VesselBox<Bottle> nameOfVesselBoxWithBottles = new VesselBox<>(numberOfBottles);
        for (int i = 0; i < numberOfBottles; i++) {
            nameOfVesselBoxWithBottles.add(new Bottle());
        }
        System.out.println("This VesselBox has" + " " + numberOfBottles + " " + "bottles");
        return nameOfVesselBoxWithBottles;
    }
    public VesselBox<Cup> createVesselBoxWithCups(int numberOfCups) {
        VesselBox<Cup> nameOfVesselBoxWithCups = new VesselBox<>(numberOfCups);
        for (int i = 0; i < numberOfCups; i++) {
            nameOfVesselBoxWithCups.add(new Cup());
        }
        System.out.println("This VesselBox has" + " " + numberOfCups + " " + "cups");
        return nameOfVesselBoxWithCups;
    }

}
