package main.java.tasks.day6;

import java.io.File;

public class ListOfFiles {
    public static void main(String[] args) {
        File folder = new File("C:\\JAVA\\CoursesYS\\HWnew\\src\\main\\java\\tasks");
        for (File file : folder.listFiles()) {
            if (file.isDirectory()) {
                for (File file1:file.listFiles()) {
                    System.out.println(file1.getName());
                }
            }
            System.out.println(file.getName());
        }
    }
}
