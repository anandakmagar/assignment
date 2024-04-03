package self_practice.exception;

public class Practice_01 {
    public static void divide(int a, int b){
        try{
            int quotient = a / b;
            System.out.println(quotient);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by 0 " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("What?");
        }
    }

    public static void main(String[] args) {
        divide(4, 0);
    }
}
