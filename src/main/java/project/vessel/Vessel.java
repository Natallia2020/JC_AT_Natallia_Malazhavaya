package main.java.project.vessel;

import main.java.project.material.Material;

import java.io.Serializable;

public abstract class Vessel implements Serializable {
    private double volume;
    private double diameter;
    private int weight;
    private Material material;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Vessel(double volume, double diameter, int weight, Material material) {
        this.volume = volume;
        this.diameter = diameter;
        this.weight = weight;
        this.material = material;
    }
    public Vessel() {

    }
}
