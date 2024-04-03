package exception_handling.practice_assignment_exception_handling_hackerrank.java_exception_handling;

import java.util.Scanner;

class Calculator {
    public static long power(int n, int p) throws Exception {
        if (n < 0 || p < 0){
            throw new Exception("n or p should not be negative.");
        }

        if (n == 0 && p == 0){
            throw new Exception("n and p should not be zero");
        }

        return (int) Math.pow(n, p);
    }
}
public class JavaExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int n = scanner.nextInt();
        System.out.println("Enter the second number");
        int p = scanner.nextInt();

        try{
            System.out.println(Calculator.power(n, p));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
