package array_processing_and_manipulation.practice_assignment_array;

public class Assignment_07 {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5};

        int middleIndex = array.length/2;

        for (int i = 0; i < array.length; i++){
            if (i == middleIndex){
                continue;
            }
            else {
                System.out.println(array[i]);
            }
        }
    }

}
