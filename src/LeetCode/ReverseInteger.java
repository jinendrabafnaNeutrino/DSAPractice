package LeetCode;

public class ReverseInteger {
    //Leet Code : https://leetcode.com/problems/reverse-integer/
    public static int reverse(int num) {
        long rev=0;
        boolean isnegativ = num<0;
        num =Math.abs(num);
        while (num!=0){
            int remainder = num%10;
            rev = rev *10+remainder;
            num = num/10;
        }
        if(isnegativ){
            rev = -rev;
        }
        if(rev >= Integer.MAX_VALUE || rev <= Integer.MIN_VALUE)
        {
            return 0;
        }
        return (int)rev;
//        int result =0;
//        while(num!=0){
//            int remainder = num %10;
//
//            if(result > Integer.MAX_VALUE/10 || result == Integer.MAX_VALUE && remainder > 7 ){
//                return 0;
//            }
//            if(result < Integer.MIN_VALUE/10 || result == Integer.MIN_VALUE && remainder < 8 ){
//                return 0;
//            }
//
//            result = result *10+remainder;
//            num= num/10;
//        }
//        return result;
    }

    public static void main(String[] args) {
        int num = -1534236469;
        int reverseNumber = reverse(num);
        System.out.println("Reverse Number --->"+reverseNumber);
    }
}
