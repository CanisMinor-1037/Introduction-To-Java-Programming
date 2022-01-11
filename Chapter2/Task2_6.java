import java.util.Scanner;
public class Task2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, number_3, number_2, number_1, number_0;
        // number = sigma(number_i * 10^i) , i=0,1,2,3
        System.out.print("Enter a number between 0 and 1000: ");
        number = input.nextInt();
        
        number_1 = number / 10;
        number_2 = number_1 / 10;
        number_3 = number_2 / 10;
        
        number_0 = number % 10;
        number_1 %= 10;
        number_2 %= 10;
        number_3 %= 10;

        
        /*System.out.println(number_3 + " " + number_2 + " "
            + number_1 + " " + number_0); */
        System.out.println(number_3 + number_2 + number_1 + number_0);

    }
}
