package main.java.tasks.day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HWFile {
    public static void main(String[] args) throws IOException {
        //построчно прочитать файл и создать стрим из его строк, пропустив первые 4 строки собрать коллекцию в одну строку,
        //разделить на по <br>, оставить только те, что начинаются с "Date log:", в каждой строке оставить только первые 20 символов,
        // к каждой в конец дописать значение текущей даты
        File file = new File("FileStream.txt");
        PrintWriter out = new PrintWriter(file);
        out.println("Date log: jssh akjdhflkj askjhd afhalkhfjk");
        out.println("afckjalhf akfj;aljhfk akjf;aij");
        out.println("ausdhuahd ajhdfgahgf");
        out.println("Date log: adfghfd ejfgkshf sjhgfshjgf");
        out.println("Date log:sfjhjlkdhf skfhklfkjh");
        out.println("sbhhhks skjhflkhf wkefhkuwh");
        out.println("Date log: <br> shefghjf <br> jhfgwegifwhhg wfehwyh");
        out.println("sjhgfsjhgfhjs <br> sjhfjshgfhj");
        out.println("Date log: sjhfgshjgfshjgfhjgfjsjh");
        out.close();
        try (Stream<String> streamFromFiles = Files.lines(Paths.get(file.getAbsolutePath()))) {
            String str = streamFromFiles.skip(4)
                    .collect(Collectors.toList())
                    .stream()
                    .collect(Collectors.joining(" "));
            List<String> listFromFile = new ArrayList<>();
            listFromFile.add(str);
//            List<Object> listFromFile2 = listFromFile.stream().flatMap((p) -> Arrays.asList(p.split("<br>"))
//                    .stream().filter(y -> y.contains("Date Log:")).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
}