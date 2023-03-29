package practice;

// Given a string s, reverse only all the vowels in the string and return it.
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

// Example 1:
// Input: s = "hello"
// Output: "holle"
// Example 2:
// Input: s = "leetcode"
// Output: "leotcede"

// Constraints:
// 1 <= s.length <= 3 * 105
// s consist of printable ASCII characters.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	    String s = "hello";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] chars = s.toCharArray();
        int first = 0, last = s.length() - 1;
        while (first < last) {
            while (first < last && !vowels.contains(chars[first])) first++;
            while (first < last && !vowels.contains(chars[last])) last--;
            char temp = chars[first];
            chars[first] = chars[last];
            chars[last] = temp;
            first++;
            last--;
        }
        s = new String(chars);
        return s;
    }
}
