package java_programming_fundamentals.practice_assignment_operators_and_numbers;

public class Assignment_03 {
    public static void main(String[] args){
        int x = 7;
        int y = 17;
        int z = x & y;

        // Decimal Binary value would be 1
        System.out.println("The binary decimal of bitwise operation & on " + x + " and " + y + ": " + Integer.toBinaryString(z));
    }
}
