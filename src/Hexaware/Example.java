package Hexaware;
import java.util.Scanner;

/**
 * Java Program - All Prime Numbers in Given Range
 */
 
public class Example {
 
    public static void main(String[] args) {
        //range
    	Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        //find all prime numbers in the given range
        for(int n=min;n<=max;n++) {
            //check if this number is prime
            if(isPrime(n)) {
                System.out.println(n);
            }
        }
    }
     
    public static boolean isPrime(int num) {    
        for(int i = 2; i <= num/i; ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}