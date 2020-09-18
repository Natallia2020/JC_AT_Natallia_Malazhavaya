package main.java.tasks.day6;

import java.io.*;
import java.util.Random;

public class CreateDirectory {
    public static void main(String[] args) {
        File files = new File("C:\\JAVA\\CoursesYS\\HWnew\\src\\main\\java\\tasks\\day6\\dir1\\dir2\\dir3\\dir4" );
        if (!files.exists()) {
            if (files.mkdirs()) {
                System.out.println("Directories are created!" );
            } else {
                System.out.println("Failed to create directories!" );
            }
        }
        File file1 = new File("C:\\JAVA\\CoursesYS\\HWnew\\src\\main\\java\\tasks\\day6\\dir1\\dir2\\dir3\\dir4\\myFile1.txt" );
        File file2 = new File("C:\\JAVA\\CoursesYS\\HWnew\\src\\main\\java\\tasks\\day6\\dir1\\dir2\\dir3\\dir4\\myFile2.txt" );
//        try(DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file1)))) {
//            Random random = new Random();
//            for (int i = 0; i < 10; i++) {
//                out.write(random.nextInt());
//            }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file1))) {
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                bw.write(random.nextInt() + " " );
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file2))) {
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                bw.write(random.nextInt() + " " );
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

