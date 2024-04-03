package self_practice.exception;

class InvalidAgeException extends RuntimeException {
    InvalidAgeException(String message){
        super(message);
    }


}
public class Practice_02 {
    public static void main(String[] args) {
        int age = 0;

        if (age < 1){
            throw new InvalidAgeException("Age cannot be less than 1");
        }
        else {
            System.out.println("You entered the valid age");
        }
    }
}
