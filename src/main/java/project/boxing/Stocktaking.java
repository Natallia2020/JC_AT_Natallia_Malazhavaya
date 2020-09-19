package main.java.project.boxing;

import main.java.project.boxing.VesselBox;
import main.java.project.vessel.Bottle;
import main.java.project.vessel.Cup;
import main.java.project.vessel.Vessel;

import java.io.*;

public class Stocktaking {
    public static void main(String[] args) {
        File f = new File("C:\\JAVA\\CoursesYS\\HWnew\\src\\main\\java\\project\\boxing\\file1.txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            Bottle bottle1 = new Bottle();
            Bottle bottle2 = new Bottle();
            Bottle bottle3 = new Bottle();
            Bottle bottle4 = new Bottle();
            Bottle bottle5 = new Bottle();
            Bottle bottle6 = new Bottle();
            Bottle bottle7 = new Bottle();
            Bottle bottle8 = new Bottle();
            Bottle bottle9 = new Bottle();
            VesselBox<Bottle> containerWithBottles = new VesselBox<>(9);
            containerWithBottles.add(bottle1);
            containerWithBottles.add(bottle2);
            containerWithBottles.add(bottle3);
            containerWithBottles.add(bottle4);
            containerWithBottles.add(bottle5);
            containerWithBottles.add(bottle6);
            containerWithBottles.add(bottle7);
            containerWithBottles.add(bottle8);
            containerWithBottles.add(bottle9);
            Cup cup1 = new Cup();
            Cup cup2 = new Cup();
            Cup cup3 = new Cup();
            VesselBox<Cup> containerWithCups = new VesselBox<>(24);
            containerWithCups.add(cup1);
            containerWithCups.add(cup2);
            containerWithCups.add(cup3);
            oos.writeObject(containerWithBottles);
            oos.writeObject(containerWithCups);
            VesselBox newContainerWithBottle = (VesselBox) ois.readObject();
            VesselBox newContainerWithCups = (VesselBox) ois.readObject();
            System.out.println("NewContainerWithBottle is" + " " + newContainerWithBottle);
            System.out.println("Container with bottles contains" + " " + newContainerWithBottle.getContainer().length + " " + "bottles");
            System.out.println("NewContainerWithCups is" + " " + newContainerWithCups);
            System.out.println("Container with cups contains" + " " + newContainerWithCups.getContainer().length + " " + "cups");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
