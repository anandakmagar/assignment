package array_processing_and_manipulation.practice_assignment_array;

import java.util.Arrays;

public class Assignment_09 {
    public static void main(String[] args) {
        int[] array = {4, 2, 9, 13, 1, 0};

        // Sorting in ascending order
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Smallest number is " + array[0]);
        System.out.println("Biggest number is " + array[array.length - 1]);

    }
}
