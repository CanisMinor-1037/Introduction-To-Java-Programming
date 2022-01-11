import java.util.Scanner;
public class Task2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.print("Enter a degree in Celsius: ");
        celsius = input.nextDouble();
        fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println(celsius + " Celsius is " + 
            fahrenheit + " Fahrenheit");
    }
}
