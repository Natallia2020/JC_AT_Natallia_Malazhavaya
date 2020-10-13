package main.java.tasks.day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HWFile {
    public static void main(String[] args) throws IOException {
        /* построчно прочитать файл и создать стрим из его строк, пропустив первые 4 строки собрать коллекцию в одну строку,
        разделить на по <br>, оставить только те, что начинаются с "Date log:", в каждой строке оставить только первые 20 символов,
        к каждой в конец дописать значение текущей даты
         */
        Arrays.stream(
                Files.lines(Paths.get("C:\\JAVA\\CoursesYS\\FileForStream.txt"))
                .skip(4)
                .collect(Collectors.joining())
                .split("<br>")
        ).filter(s -> s.startsWith("Date log:"))
                .peek(s -> s.substring(0, 20).concat(LocalDate.now().toString()))
        .peek(System.out::println);

        }
}