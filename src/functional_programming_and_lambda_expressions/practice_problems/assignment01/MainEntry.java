package functional_programming_and_lambda_expressions.practice_problems.assignment01;

import java.util.Scanner;

@FunctionalInterface
interface Calc<T> {
    T compute(T[] array);
}

public class MainEntry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu");
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

            Calc<Integer> calc = new Calc<Integer>() {
                int sum = 0;
                @Override
                public Integer compute(Integer[] array) {
                    for (int j = 0; j < arrayLength; j++){
                        sum = sum + array[j];
                    }
                    return sum;
                }
            };

            System.out.println("The sum of your entered numbers is " + calc.compute(array));
        }

        else if (choice == 2){
            System.out.println("Please enter only two numbers");
            int arrayLength = 2;

            Integer[] array = new Integer[arrayLength];

            for (int i = 0; i < arrayLength; i++){
                array[i] = scanner.nextInt();
            }

            Calc<Integer> calc = new Calc<Integer>() {
                int difference = 0;
                @Override
                public Integer compute(Integer[] array) {
                    difference = array[0] - array[1];
                    return difference;
                }
            };

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

            Calc<Integer> calc = new Calc<Integer>() {
                int product = 1;
                @Override
                public Integer compute(Integer[] array) {
                    for (int j = 0; j < arrayLength; j++){
                        product = product * array[j];
                    }
                    return product;
                }
            };

            System.out.println("The product of your entered numbers is " + calc.compute(array));
        }

        else if (choice == 4){
            System.out.println("Please enter only two numbers");
            int arrayLength = 2;
            scanner.nextLine();

            Integer[] array = new Integer[arrayLength];

            for (int i = 0; i < arrayLength; i++){
                array[i] = scanner.nextInt();
            }

            Calc<Integer> calc = new Calc<Integer>() {
                int quotient = 1;
                @Override
                public Integer compute(Integer[] array) {
                    quotient = array[0]/array[1];
                    return quotient;
                }
            };

            System.out.println("The quotient of your entered numbers is " + calc.compute(array));
        }

        else {
            System.out.println("You entered an INVALID choice");
        }
    }
}

/*
 Double[] doubleNumbers = new Double[numbers.length];
                    for (int i = 0; i < numbers.length; i++) {
                        doubleNumbers[i] = numbers[i].doubleValue();
                    }
 */