import java.util.Scanner;
public class Task2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();
        double weightInKilograms = weightInPounds * 0.45359237;

        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();
        double heightInMetres = heightInInches * 0.0254;

        double BMI = weightInKilograms / Math.pow(heightInMetres, 2);
        System.out.println("BMI is " + BMI);
    }
}
