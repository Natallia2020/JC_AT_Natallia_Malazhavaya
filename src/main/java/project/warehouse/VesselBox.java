package main.java.project.warehouse;

import main.java.project.vessel.Vessel;

import java.io.Serializable;
import java.lang.reflect.Type;
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

    public String getTypeContainer() {
        T type = container[0];
        String type2 = type.getClass().getSimpleName();
        return type2;
    }
}

