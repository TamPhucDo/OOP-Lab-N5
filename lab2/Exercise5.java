
public class Exercise5 {



    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }    
    
    public static int countPrimes(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.println(arr[i] + " is a prime number.");
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 7, 10, 11, 15, 17, 20};
        
        int primeCount = countPrimes(numbers);
        
        System.out.println("Total prime numbers found: " + primeCount); 
    }
}