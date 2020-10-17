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

    public void createVesselBox(String name, int capacity, double volume, Material material, Transformable stuff, Class <?> clazz) {
        List <Containable> box = new ArrayList<>();
        if (capacity == 9 | capacity == 24 | capacity == 36) {
            for (int i = 0; i < capacity; i++) {
                box.add(createVessel(volume, material, stuff, clazz));
            }
        }
        VesselBox vesselBox = new VesselBox(name, box);
    }

    public Containable createVessel(double volume, Material material, Transformable stuff, Class <?> clazz) {
        if (clazz.getClass().getSimpleName().equals("Bottle")) {
            return new Bottle(volume, material, (SparklingWater) stuff);
        }
        if (clazz.getClass().getSimpleName().equals("Can")) {
            return new Can(volume, material);
        }
        if (clazz.getClass().getSimpleName().equals("Cup")) {
            return new Cup(volume, material);
        }
        else return null;

    }

}
