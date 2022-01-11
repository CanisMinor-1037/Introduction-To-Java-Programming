import java.util.Scanner;
public class Task2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double feet, meters;

        System.out.print("Enter a value for feet: ");
        feet = input.nextDouble();

        meters = feet * 0.305;

        System.out.println(feet + " feet is " + meters 
            + " meters");
    }
}
