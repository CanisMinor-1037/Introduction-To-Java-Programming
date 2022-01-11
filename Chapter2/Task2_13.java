import java.util.Scanner;
public class Task2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the monthly saving amount: ");
        double monthlySavingAmount = input.nextDouble();
        double Amount = 0;
        final double rate = 0.00417;
        // the first month
        Amount += monthlySavingAmount;
        Amount *= (1 + rate);

        // the second month
        Amount += monthlySavingAmount;
        Amount *= (1 + rate);

        // the third month
        Amount += monthlySavingAmount;
        Amount *= (1 + rate);

        // the forth month
        Amount += monthlySavingAmount;
        Amount *= (1 + rate);

        // the fifth month
        Amount += monthlySavingAmount;
        Amount *= (1 + rate);

        // the sixth month
        Amount += monthlySavingAmount;
        Amount *= (1 + rate);

        System.out.println("After the sixth month, the account value is $" + Amount);
    }
}
