import java.util.Scanner;
public class Task2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pounds, kilograms;

        System.out.print("Enter a number in pounds: ");
        pounds = input.nextDouble();

        kilograms = pounds * 0.454;

        System.out.println(pounds + " pounds is " +
            kilograms + " kilograms");
    }
}
