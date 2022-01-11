import java.util.Scanner;
public class Task2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int year = input.nextInt();
        long population =(long)(312032486 + (year*365*24*60*60) * (1.0/7 - 1.0/13 + 1.0/45));

        System.out.println("The population in " + year + " years is " + population);
    }
}
