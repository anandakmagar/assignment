package self_practice;

public class Practice_01 {

    public static void main(String[] args) {
        int[] array = {100, 3, 2, 1, 4, 5, 3};

        int min = array[0];

        for (int i = 0; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }

        System.out.println(min);
    }
}