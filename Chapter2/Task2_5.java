import java.util.Scanner;
public class Task2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double subtotal, gratuityRate, gratuity, total;

        System.out.print("Enter the subtotal and a gratuity rate: ");
        subtotal = input.nextDouble();
        gratuityRate = input.nextDouble();
        gratuityRate /= 100;

        gratuity = subtotal * gratuityRate;
        total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity +
            " and total is $" + total);
    }
}
