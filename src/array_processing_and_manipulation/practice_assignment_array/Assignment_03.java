package array_processing_and_manipulation.practice_assignment_array;

import java.util.Arrays;

public class Assignment_03 {
    public static void main(String[] args) {
        String[] array = {"red", "green", "blue", "yellow"};

        int arrayLength = array.length;
        System.out.println("Array length is " + arrayLength);

        String[] newArray = array.clone();

        System.out.println(Arrays.toString(newArray));

    }
}
