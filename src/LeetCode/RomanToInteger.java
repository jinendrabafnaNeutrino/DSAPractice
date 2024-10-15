package LeetCode;

import java.util.HashMap;
import java.util.Map;

class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int ans = 0;


//int answer=output("MCDLXXVI");
        // 1000 100 500 50 10 10 5 1
        for (int i=0;i<s.length();i++) {
            int s1 = roman.get(s.charAt(i));
            //s1 = 100
            //ans 1000
            if (i + 1 < s.length()) {
                int s2 = roman.get(s.charAt(i + 1));
                //s2 = 500
                if (s1 >= s2) {
                    ans += s1;
                } else {
                    ans += (s2 - s1);
                    i++;
                }
            }else {
                ans+=s1;
            }
        }


        return ans;
    }

}

