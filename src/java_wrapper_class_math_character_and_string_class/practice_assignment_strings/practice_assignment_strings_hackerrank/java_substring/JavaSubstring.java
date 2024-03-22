package java_wrapper_class_math_character_and_string_class.practice_assignment_strings.practice_assignment_strings_hackerrank.java_substring;

// https://www.hackerrank.com/challenges/java-substring/problem

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String S = sc.next();

        System.out.println("Enter the start index (inclusive)");
        int start = sc.nextInt();

        System.out.println("Enter the end index (exclusive)");
        int end = sc.nextInt();

        System.out.println(S.substring(start, end));
    }
}
