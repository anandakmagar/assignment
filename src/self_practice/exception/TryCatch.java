package self_practice.exception;

import java.util.InputMismatchException;

public class TryCatch {
    public static void tryCatch(int x, int y){
        try {
            Integer.parseInt(String.valueOf(x));
            int result = x / y;
            System.out.println(result);
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        tryCatch(8, 0);
    }
}
