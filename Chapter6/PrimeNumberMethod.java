public class PrimeNumberMethod {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumbers(50);
    }

    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;

        while(count < numberOfPrimes){
            if(isPrime(number)){
                count++;
            
                if(count%NUMBER_OF_PRIMES_PER_LINE == 0){
                    System.out.printf("%-5s \n",number);
                } else {
                    System.out.printf("%-5s ",number);
                }
            }
            number++;
        }

    }

    public static boolean isPrime(int number) {
        if(number <= 1){
            return false;
        } else if(number == 2){
            return true;
        } else {
            for(int i=2;i*i<=number;i++){
                if(number%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
