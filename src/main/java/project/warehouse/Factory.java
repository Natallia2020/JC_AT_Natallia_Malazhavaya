package main.java.project.warehouse;

import main.java.project.material.Material;
import main.java.project.stuff.SparklingWater;
import main.java.project.stuff.Transformable;
import main.java.project.vessel.Bottle;
import main.java.project.vessel.Can;
import main.java.project.vessel.Containable;
import main.java.project.vessel.Cup;

import java.util.ArrayList;
import java.util.List;

public class Factory {
    private Warehouse warehouse;

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void createVesselBox(int capacity, double volume, Material material, Transformable stuff, Class <?> clazz) {
        List <Containable> box = new ArrayList<>();

    }
    public Containable createVessel(double volume, Material material, Transformable stuff, Class <?> clazz) {
        if (clazz.equals("Bottle")) {
        } else if (clazz.equals("Can")) {
            return new Can(volume, material);
        } else if (clazz.equals("Cup")) {
            return new Cup(volume, material);
        }
        return new Bottle(volume, material, (SparklingWater) stuff);

    }

//    public Containable createVessel(double volume, Material material, Transformable stuff, Class <?> clazz) {
//        if (clazz.equals("Bottle"))
//        return new Bottle(volume, material, (SparklingWater) stuff);
//        if (clazz.equals("Can"))
//            return new Can(volume, material);
//        if (clazz.equals("Cup"))
//            return new Cup(volume, material);
//
//
//    }
}
