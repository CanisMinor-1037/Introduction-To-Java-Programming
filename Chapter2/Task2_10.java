import java.util.Scanner;
public class Task2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int C = 4184;
        
        System.out.print("Enter the amount of water in kilograms: ");
        double amountOfWater = input.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();

        double energy = amountOfWater * (finalTemperature - initialTemperature) * C;
        System.out.println("The energy needed is " + energy);
    }
}
