package array_processing_and_manipulation.practice_assignment_array;

import java.util.Arrays;

public class Assignment_08 {
    public static void main(String[] args){
        String[] array = {"Colorado", "Washington", "New York", "Ohio", "Wyoming"};

        int middleIndex = array.length/2;

        String temp = "";

        temp = array[0];
        array[0] = array[middleIndex];
        array[middleIndex] = temp;

        System.out.println(Arrays.toString(array));

    }
}
