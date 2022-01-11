import java.util.Scanner;
public class Task2_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for a triangle: ");
        double x_1 = input.nextDouble();
        double y_1 = input.nextDouble();
        double x_2 = input.nextDouble();
        double y_2 = input.nextDouble();
        double x_3 = input.nextDouble();
        double y_3 = input.nextDouble();

        double edge_1 = Math.pow(Math.pow(x_2-x_1,2)+Math.pow(y_2-y_1,2),0.5);
        double edge_2 = Math.pow(Math.pow(x_3-x_1,2)+Math.pow(y_3-y_1,2),0.5);
        double edge_3 = Math.pow(Math.pow(x_3-x_2,2)+Math.pow(y_3-y_2,2),0.5);
        
        double s = (edge_1 + edge_2 + edge_3) / 2;
        double area = Math.pow(s*(s-edge_1)*(s-edge_2)*(s-edge_3), 0.5);

        System.out.println("The area of the triangle is " + area);
    }
}
