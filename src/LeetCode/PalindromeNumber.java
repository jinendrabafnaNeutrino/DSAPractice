package LeetCode;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }
    public static boolean isPalindrome(int n){
        int remainder=0;
        int result=0;
        int originalNumber = n;

        while(n>0){
            remainder = n%10;
            result = result *10 + remainder;
            n=n/10;
        }
        if(result == originalNumber){
            return true;
        }else{
            return false;
        }
    }
}
