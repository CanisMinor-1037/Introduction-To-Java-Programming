import java.util.Scanner;
public class Task2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long minutes, years, days;
        final long minutesPerDay = 60 * 24;
        final long daysPerYear = 365;
        System.out.print("Enter the number of minutes: ");
        minutes = input.nextLong();

        days = minutes / minutesPerDay;
        years = days / daysPerYear;
        days %= daysPerYear;

        System.out.println(minutes + " minutes is approximately "
            + years + " years and " + days + " days");
    }
}
