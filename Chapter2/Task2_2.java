import java.util.Scanner;
public class Task2_2 {
    public static void main(String[] args) {
        final double p = 3.14159;
        
        Scanner input = new Scanner(System.in);
        double radius, length, area, volume;

        System.out.print("Enter the radius and length of a cylinder: ");
        radius = input.nextDouble();
        length = input.nextDouble();

        area = radius * radius * p;
        System.out.println("The area is " + area);
        
        volume = area * length;
        System.out.println("The volume is " + volume);
    }
}
