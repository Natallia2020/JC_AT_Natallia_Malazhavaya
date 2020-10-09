package main.java.project.warehouse;

import main.java.project.warehouse.VesselBox;
import main.java.project.vessel.Bottle;
import main.java.project.vessel.Cup;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Stocktaking {
    public void stocktaking(VesselBox vesselBox) {
        File f = new File("C:\\JAVA\\CoursesYS\\HWnew\\src\\main\\java\\project\\warehouse\\file1.txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            oos.writeObject(vesselBox);
            VesselBox newContainer = (VesselBox) ois.readObject();
            System.out.println("This VesselBox contains" + " " + newContainer.getContainer().length + " " + newContainer.getTypeContainer());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
