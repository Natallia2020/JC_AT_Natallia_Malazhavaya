package main.java.project.warehouse;

import main.java.project.vessel.Containable;
import main.java.project.vessel.Vessel;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class VesselBox<T> extends Vessel implements Serializable {

    static private int id = 0;
    private String name;
    private int capacity;
    private List<Containable> box;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Containable> getBox() {
        return box;
    }

    public VesselBox(String name, List<Containable> box) {
        capacity = box.size();
        if (capacity == 9 | capacity == 24 | capacity == 36) {
            id++;
            this.name = name;
            this.box = box;
        } else
            System.out.println("Enter correct size of VesselBox");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VesselBox<?> vesselBox = (VesselBox<?>) o;
        return id == vesselBox.id &&
                capacity == vesselBox.capacity &&
                Objects.equals(name, vesselBox.name) &&
                Objects.equals(box, vesselBox.box);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, capacity, box);
    }

    public String getTypeContainer() {
        Containable type = this.box.get(0);
        String type2 = type.getClass().getSimpleName();
        return type2;
    }
}