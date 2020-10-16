package main.java.project.warehouse;

import main.java.project.warehouse.VesselBox;
import main.java.project.vessel.Bottle;
import main.java.project.vessel.Cup;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stocktaking {
    private static final Path FILE = Paths.get("C:\\JAVA\\CoursesYS\\HWnew\\src\\main\\java\\project\\warehouse\\file2.txt");

    private Stocktaking() {
    }

    public static void getInfo() throws IOException {
        List<String> lines = new ArrayList<>();

        try (Stream<String> lineStream = Files.lines(FILE)) {

            lines = lineStream.collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("State of the Stocktaking:");
        System.out.println(lines);
    }

    public static void registerBox(VesselBox box) {
        File file = new File("C:\\JAVA\\CoursesYS\\HWnew\\src\\main\\java\\project\\warehouse\\file2.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(Integer.toString(box.hashCode()) + " " + box.getName());
            writer.newLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void disposeBox(VesselBox box) throws IOException {

        List<String> warehouseBeforeDeleting = new ArrayList<>();
        List<String> warehouseAfterDeleting = new ArrayList<>();
        String deleteVesselBox = Integer.toString(box.hashCode()) + " " + box.getName();

        try (Stream<String> lineStream = Files.lines(FILE)) {

            warehouseBeforeDeleting = lineStream.collect(Collectors.toList());
            warehouseAfterDeleting = warehouseBeforeDeleting.stream().filter(s -> !s.equals(deleteVesselBox)).collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        deletingInformationFromFile();
        File file = new File("C:\\JAVA\\CoursesYS\\HWnew\\src\\main\\java\\project\\warehouse\\file2.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            for (int i = 0; i < warehouseAfterDeleting.size(); i++) {
                writer.write(warehouseAfterDeleting.get(i));
                writer.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deletingInformationFromFile() {
        File file = new File("C:\\JAVA\\CoursesYS\\HWnew\\src\\main\\java\\project\\warehouse\\file2.txt");
        PrintWriter writerForDeleting = null;
        try {
            writerForDeleting = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        writerForDeleting.print("");
        writerForDeleting.close();
    }
}


