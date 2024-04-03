package exception_handling.practice_assignment_exception_handling_hackerrank.java_exception_handling_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter the first number");
            int x = scanner.nextInt();
            System.out.println("Enter the second number");
            int y = scanner.nextInt();

            System.out.println(x/y);
        } catch (InputMismatchException e){
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e){
            System.out.println(e.getClass().getName() + ":" + " " + e.getMessage());
        }
    }
}
