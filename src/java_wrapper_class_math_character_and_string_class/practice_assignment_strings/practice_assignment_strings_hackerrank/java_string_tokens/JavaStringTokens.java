package java_wrapper_class_math_character_and_string_class.practice_assignment_strings.practice_assignment_strings_hackerrank.java_string_tokens;

// https://www.hackerrank.com/challenges/java-string-tokens/problem

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String s = sc.nextLine();

        String s2 = s.trim();

        if (s2.trim().isEmpty()){
            System.out.println("0");
        }
        else {
            String s3 = s2.replaceAll("\\s+", " ");

            String[] s3Array = s3.split("[^a-zA-Z]+");

            System.out.println(s3Array.length);

            for (int i = 0; i < s3Array.length; i++){
                System.out.println(s3Array[i]);
            }

        }
    }
}
