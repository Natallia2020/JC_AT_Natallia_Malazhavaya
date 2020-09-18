package main.java.tasks.day6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class RollTheMonth  {
    public static int rollMonth(Integer month) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM");
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.MONTH, month);
        calendar.roll(Calendar.MONTH, +1);
        return calendar.get(Calendar.MONTH);
    }

    public static void main(String[] args) throws ParseException {
        System.out.println("Enter the number of month");
        Scanner scanner = new Scanner(System.in);
        Integer month = scanner.nextInt();
        System.out.println("It's next month");
        System.out.println(rollMonth(month));
    }
}

