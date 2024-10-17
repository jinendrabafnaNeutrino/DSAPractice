package LeetCode;

import java.util.Scanner;

public class PrimeNumber {

    static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number range");
//        int num = sc.nextInt();
//        System.out.println("Result ------> "+isPrime(num));
        int range =sc.nextInt();;

        for(int i =1;i<=range;i++){
            if(isPrime(i)){
                    System.out.print(i + " ");
            }
        }

        for(int i = 1;i<=range;++i){
            if(i%2==0){
                System.out.println(i+" ");
            }
        }

    }
}
