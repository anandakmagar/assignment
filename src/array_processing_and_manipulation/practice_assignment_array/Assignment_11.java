package array_processing_and_manipulation.practice_assignment_array;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many favorite things do you have?");
        int num = scanner.nextInt();

        String[] array = new String[num];

        System.out.println("Enter your favorite things one-by-one");

        scanner.nextLine();

        for (int i = 0; i < num; i++){
            array[i] = scanner.nextLine();
        }

        System.out.println(Arrays.toString(array));
    }
}
