package main.java.tasks.day6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class RollTheMonth  {
//    public static int rollMonth(Integer month) throws ParseException {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM");
//        Calendar calendar = new GregorianCalendar();
//        calendar.set(Calendar.MONTH, month);
//        calendar.roll(Calendar.MONTH, +1);
//        return calendar.get(Calendar.MONTH);
//    }

    public static void main(String[] args) throws ParseException {
//        System.out.println("Enter the number of month");
//        Scanner scanner = new Scanner(System.in);
//        Integer month = scanner.nextInt();
//        System.out.println("It's next month");
//        System.out.println(rollMonth(month));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the month (For ex. September)");
        String month = scanner.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM");
        Date date = formatter.parse(month);
        DateFormat dateFormat = new SimpleDateFormat("M");
        String monthNum = dateFormat.format(date);
        int num = Integer.parseInt(monthNum);
        num++;
        String newMonth = Integer.toString(num);
        SimpleDateFormat formatter1 = new SimpleDateFormat("M");
        Date newDate = formatter1.parse(newMonth);
        System.out.printf("%tB", newDate);

    }
}

