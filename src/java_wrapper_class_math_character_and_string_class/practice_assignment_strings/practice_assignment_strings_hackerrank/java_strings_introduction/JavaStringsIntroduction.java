package java_wrapper_class_math_character_and_string_class.practice_assignment_strings.practice_assignment_strings_hackerrank.java_strings_introduction;

// https://www.hackerrank.com/challenges/java-strings-introduction/problem
import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String A");
        String A = sc.next();
        System.out.println("Enter String B");
        String B = sc.next();

        int sum = A.length() + B.length();

        System.out.println(sum);

        if (A.compareTo(B) > 0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capB = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(capA + " " + capB);

    }
}
