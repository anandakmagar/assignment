package java_wrapper_class_math_character_and_string_class.practice_assignment_strings.practice_assignment_strings_hackerrank.java_string_reverse;

// https://www.hackerrank.com/challenges/java-string-reverse/problem

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String A = sc.next();

        String reversed = "";

        for (int i = A.length() - 1; i >= 0; i--){
            reversed = reversed + A.charAt(i);
        }

        if (A.equals(reversed)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
