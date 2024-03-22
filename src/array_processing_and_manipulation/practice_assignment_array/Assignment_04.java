package array_processing_and_manipulation.practice_assignment_array;

public class Assignment_04 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("First index element is " + array[0]);
        System.out.println("Last index element is " + array[array.length - 1]);

        // Trying to print the element at index array.length (without substracting 1)
        // System.out.println(array[array.length]);
        // It threw the exception, Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        // System.out.println(array[5]);
        // Same exception occurred, Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

    }
}
