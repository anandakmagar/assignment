package array_processing_and_manipulation.practice_assignment_array;

import java.util.Arrays;

public class Assignment_05 {
    public static void main(String[] args){
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }

        System.out.println(Arrays.toString(array));

    }
}
