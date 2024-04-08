package functional_programming_and_lambda_expressions.practice_problems.assignment02;

import java.util.Arrays;
import java.util.Scanner;

@FunctionalInterface
interface Calc2<T> {
    T compute(Integer[] array);
}

public class MainEntry2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*********Menu*************");
        System.out.println("What would you like to do?");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        int choice = scanner.nextInt();

        if (choice == 1){
            System.out.println("How many numbers do you want to enter");
            int arrayLength = scanner.nextInt();
            scanner.nextLine();

            Integer[] array = new Integer[arrayLength];

            for (int i = 0; i < arrayLength; i++){
                array[i] = scanner.nextInt();
            }

            Calc2<Integer> calc = numberArray -> Arrays.stream(array).reduce(0, Integer::sum);

            System.out.println("The sum of your entered numbers is " + calc.compute(array));
        }

        else if (choice == 2){
            System.out.println("Please enter only two numbers");
            int arrayLength = 2;

            Integer[] array = new Integer[arrayLength];

            for (int i = 0; i < arrayLength; i++){
                array[i] = scanner.nextInt();
            }

            Calc2<Integer> calc = numberArray -> Arrays.stream(array).reduce((x, y) -> array[0] - array[1]).orElse(0);

            System.out.println("The difference of those two numbers is " + calc.compute(array));

        }



        else if (choice == 3){
            System.out.println("How many numbers do you want to enter");
            int arrayLength = scanner.nextInt();
            scanner.nextLine();

            Integer[] array = new Integer[arrayLength];

            for (int i = 0; i < arrayLength; i++){
                array[i] = scanner.nextInt();
            }

            Calc2<Integer> calc = numberArray -> Arrays.stream(array).reduce(1, Math::multiplyExact);

            System.out.println("The product of your entered numbers is " + calc.compute(array));
        }

        else if (choice == 4) {
            System.out.println("Please enter only two numbers");
            int arrayLength = 2;
            scanner.nextLine();

            Integer[] array = new Integer[arrayLength];

            for (int i = 0; i < arrayLength; i++) {
                array[i] = scanner.nextInt();
            }

            Calc2<Integer> calc = numberArray -> Arrays.stream(array).reduce((x, y) -> array[0] / array[1]).orElseThrow(
                    () -> new ArithmeticException("Cannot divide by zero")
            );

            System.out.println("The quotient of your entered numbers is " + calc.compute(array));
        }


        else {
            System.out.println("You entered an INVALID choice");
        }
    }
}
