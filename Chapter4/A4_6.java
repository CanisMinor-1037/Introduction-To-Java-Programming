public class A4_6 {
    public static void main(String[] args) {
        double amount = 12618.98;
        double interestRate = 0.0013;
        double interest = amount * interestRate;
        System.out.println("Interest is $" + interest);
        System.out.println("Interest is $" + (int)(interest * 100)/100.0);
        System.out.printf("Interest is $%4.2f\n",interest);

        int count = 5;
        double amount1 = 45.56;
        System.out.printf("Count is %d and amount is %f\n",count,amount1);
        System.out.printf("%3d#%4s#%4.2f\n",1234,"Java",51.6653);
        System.out.printf("%8d%8s%8.1f\n",1234,"Java",5.63);
        System.out.printf("%-8d%-8s%-8.1f\n",1234,"Java",5.63);
    }
}
