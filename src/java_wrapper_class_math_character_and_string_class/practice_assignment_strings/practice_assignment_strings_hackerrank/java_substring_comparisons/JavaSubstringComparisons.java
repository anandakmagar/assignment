package java_wrapper_class_math_character_and_string_class.practice_assignment_strings.practice_assignment_strings_hackerrank.java_substring_comparisons;

// https://www.hackerrank.com/challenges/java-string-compare/problem

import java.util.Scanner;

public class JavaSubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for (int i = 1; i <= s.length() - k; i++){
            String currentSubstring = s.substring(i, k + i);
            if (currentSubstring.compareTo(smallest) < 0){
                smallest = currentSubstring;
            }
            if (currentSubstring.compareTo(largest) > 0){
                largest = currentSubstring;
            }
        }

        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string s");
        String s = sc.next();

        System.out.println("Enter k");
        int k = sc.nextInt();

        System.out.println(getSmallestAndLargest(s, k));

    }
}
