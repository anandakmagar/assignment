package java_programming_fundamentals.practice_assignment_operators_and_numbers;

public class Assignment_02 {
    public static void main(String[] args){
        int x = 150;
        System.out.println("The binary string value of initial x: " + Integer.toBinaryString(x));

        // Right shifting the x by 2 and assign it to x
        x = x >> 2;

        // Expected new decimal value of x is 37 and the binary value is 100101
        System.out.println("New value of x: " + x);
        System.out.println("New binary value of x: " + Integer.toBinaryString(x));

        System.out.println();
        // When x = 225
        System.out.println("When x = 225");
        x = 225;
        System.out.println("The binary string value of initial x: " + Integer.toBinaryString(x));

        // Right shifting the x by 2 and assign it to x
        x = x >> 2;

        // Expected new decimal value of x is 56 and the binary value is 111000
        System.out.println("New value of x: " + x);
        System.out.println("New binary value of x: " + Integer.toBinaryString(x));

        System.out.println();
        // When x = 1555
        System.out.println("When x = 1555");
        x = 1555;
        System.out.println("The binary string value of initial x: " + Integer.toBinaryString(x));

        // Right shifting the x by 2 and assign it to x
        x = x >> 2;

        // Expected new decimal value of x is 388 and the binary value is 110000100
        System.out.println("New value of x: " + x);
        System.out.println("New binary value of x: " + Integer.toBinaryString(x));

        System.out.println();
        // When x = 32456
        System.out.println("When x = 32456");
        x = 32456;
        System.out.println("The binary string value of initial x: " + Integer.toBinaryString(x));

        // Right shifting the x by 2 and assign it to x
        x = x >> 2;

        // Expected new decimal value of x is 8114 and the binary value is 1111110110010
        System.out.println("New value of x: " + x);
        System.out.println("New binary value of x: " + Integer.toBinaryString(x));


    }
}
