package main.java.project.boxing;

import main.java.project.vessel.Vessel;

import java.io.Serializable;
import java.util.Arrays;

public class VesselBox<T> extends Vessel implements Serializable {
    private T[] container;
    private int currentPosition;

    public T[] getContainer() {
        return container;
    }

    public void setContainer(T[] container) {
        this.container = container;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public VesselBox(int i){
        if (i == 9) {
            container = (T[]) new Object[i];
            currentPosition = 0;
        }
        if (i == 24){
            container = (T[]) new Object[i];
            currentPosition = 0;
        }
        if (i == 36){
            container = (T[]) new Object[i];
            currentPosition = 0;
        }

        if (i != 9 && i != 24 && i != 36) {
            System.out.println("Enter correct size of VesselBox");
        }
    }

    public void add(T o){
        if (currentPosition < container.length){
            container[currentPosition++] = o;
        }
    }
    @Override
    public String toString() {
        return "VesselBox{" +
                "container=" + Arrays.toString(container) +
                '}';
    }
}

