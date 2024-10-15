package LeetCode;

import java.util.Arrays;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        String prefixOutput = longestPrefix(arr);

        String str = "jinendra";
        String str1 = "kaustubh";
        System.out.println("Hash Code: "+str.hashCode());
        System.out.println("Hash Code: "+str1.hashCode());

    }

    public static String longestPrefix(String[] arr) {
        String common = "";
//        int shortestLength = arr[0].length();
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i].length() < shortestLength) {
//                shortestLength = arr[i].length();
//            }
//        }
//        System.out.println("shortestLength :- " + shortestLength);
//        boolean flag = false;
//        for (int i = 0; i < shortestLength; i++) {
//            char chareacter = 0;
//            for (int j = 0; j < arr.length - 1; j++) {
//                if (arr[j].charAt(i) == arr[j + 1].charAt(i)) {
//                    chareacter = arr[j].charAt(i);
//                    flag = true;
//                } else {
//                    break;
//                }
//            }
//            if (flag){
//                common = common + Character.toString(chareacter);
//            }
//            System.out.println(common);
//        }

        Arrays.sort(arr);
        String s1 = arr[0];
        String s2 = arr[arr.length-1];
        int index = 0;

        while(index <s1.length() && index < s2.length()){
            if(s1.charAt(index)==s2.charAt(index)){
                index++;
            }else{
                break;
            }
        }
        return s1.substring(0,index);
    }
}
