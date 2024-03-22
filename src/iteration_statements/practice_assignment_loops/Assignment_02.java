package iteration_statements.practice_assignment_loops;

import java.util.Scanner;

public class Assignment_02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();

        int gcd = 0;

        int smallestNum = Math.min(num1, num2);

        if (num1 < 0 || num2 < 0){
            System.out.println("Invalid number(s), since one or both numbers are negative!!");
        }

        else if (num1 == 0 || num2 == 0 || num1 == 1 || num2 == 1){
            gcd = 1;
            System.out.println(gcd);
        }

        else{
            for (int i = 2; i <= smallestNum; i++){
                if (num1 % i == 0 && num2 % i == 0){
                    gcd = i;
                }
            }
            System.out.println("The Greatest Common Divisor of " + num1 + " and " + num2 + " is " + gcd);
        }
    }
}
