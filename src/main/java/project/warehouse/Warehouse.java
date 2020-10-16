package main.java.project.warehouse;

import main.java.project.vessel.Bottle;
import main.java.project.vessel.Cup;
import main.java.project.vessel.Vessel;

import java.util.*;

public class Warehouse {

    private Map<Integer, VesselBox> stock = new HashMap<>();

    public Map<Integer, VesselBox> getStock() {
        return stock;
    }

    public void setStock(Map<Integer, VesselBox> stock) {
        this.stock = stock;
    }

    public void addBox(VesselBox box) {
        stock.put(box.getId(), box);
    }

    public void removeBox(int id) {
        stock.remove(id);
    }

    VesselBox getBox() {
        System.out.println("Enter ID of VesselBox");
        Scanner sc = new Scanner(System.in);
        int getID = sc.nextInt();
        return stock.get(getID);
    }
}