package main.java.project.vessel;

import main.java.project.material.Material;
import main.java.project.stuff.Transformable;

public class Can extends Vessel implements Containable {
    private Transformable stuff;
    private double diametr = 10.0;

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

    public Can(double volume, Material material) {
        super(volume, material);
    }

    public Can() {
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

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }
}
