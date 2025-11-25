package p4.leetcode;

import java.util.HashMap;
import java.util.Map;

public class P13RomanToInt {
    public int romanToInt(String s) {
        Map<Character,Integer> romanNumbers = new HashMap<>();
        romanNumbers.put('I',1);
        romanNumbers.put('V',5);
        romanNumbers.put('X',10);
        romanNumbers.put('L',50);
        romanNumbers.put('C',100);
        romanNumbers.put('D',500);
        romanNumbers.put('M',1000);

        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentRomanNumber = romanNumbers.get(s.charAt(i));
            if (i < s.length()-1) {
                int nextRomanNumber = romanNumbers.get(s.charAt(i + 1));
                if (nextRomanNumber > currentRomanNumber) {
                    currentRomanNumber = nextRomanNumber - currentRomanNumber;
                    i++;
                }
            }
            num = num + currentRomanNumber;
        }
        return num;
    }

}
