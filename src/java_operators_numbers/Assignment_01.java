package java_operators_numbers;

public class Assignment_01 {
    public static void main(String[] args){
        System.out.println("When the value is 2");
        // When x = 2
        int x = 2;
        System.out.println("Initial binary value of " + x + " is " + Integer.toBinaryString(x));

        x = x << 1;

        // Predicted binary value: 100
        System.out.println("After shifting the left, the binary value of " + x  + " is " + Integer.toBinaryString(x));
        // Predicted decimal value: 4
        System.out.println("Decimal value of " + Integer.toBinaryString(x) + " is " + x);

        System.out.println();

        System.out.println("When the value is 9");
        int y = 9;
        System.out.println("Initial binary value of " + y + " is " + Integer.toBinaryString(y));

        y = y << 1;

        // Predicted binary value: 10010
        System.out.println("After shifting the left, the binary value of " + y  + " is " + Integer.toBinaryString(y));
        // Predicted decimal value: 18
        System.out.println("Decimal value of " + Integer.toBinaryString(y)+ " is " + y);

        System.out.println();
        System.out.println("When the value is 17");
        int z = 17;
        System.out.println("Initial binary value of " + z + " is " + Integer.toBinaryString(z));

        z = z << 1;

        // Predicted binary value: 100010
        System.out.println("After shifting the left, the binary value of " + z  + " is " + Integer.toBinaryString(z));
        // Predicted decimal value: 34
        System.out.println("Decimal value of " + Integer.toBinaryString(z)+ " is " + z);

        System.out.println();
        System.out.println("When the value is 88");
        int a = 88;
        System.out.println("Initial binary value of " + a + " is " + Integer.toBinaryString(a));

        a = a << 1;


        // Predicted binary value: 10110000
        System.out.println("After shifting the left, the binary value of " + a  + " is " + Integer.toBinaryString(a));
        // Predicted decimal value: 176
        System.out.println("Decimal value of " + Integer.toBinaryString(a)+ " is " + a);

    }
}

                /*
                Output

                When the value is 9
                Initial binary value of 9 is 1001
                After shifting the left, the binary value of 18 is 10010
                Decimal value of 10010 is 18

                When the value is 17
                Initial binary value of 17 is 10001
                After shifting the left, the binary value of 34 is 100010
                Decimal value of 100010 is 34

                When the value is 88
                Initial binary value of 88 is 1011000
                After shifting the left, the binary value of 176 is 10110000
                Decimal value of 10110000 is 176
                 */
