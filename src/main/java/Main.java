import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int day;
        int month;
        int year;

        System.out.println("Enter a day, month, year:");
        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();

        GregorianCalendar gc = new GregorianCalendar();

        gc.set(Calendar.DAY_OF_MONTH, day);
        gc.set(Calendar.MONTH, month);
        gc.set(Calendar.YEAR, year);

        System.out.println(gc.get(Calendar.DAY_OF_MONTH) + "/" + gc.get(Calendar.MONTH) + "/" + gc.get(Calendar.YEAR));
    }
}
