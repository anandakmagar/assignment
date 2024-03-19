package java_programming_fundamentals.practice_assignment_core_java_variables;

import java.text.DecimalFormat;

public class JavaBasicsClass {
    public static void main(String[] args){
        /*
        1.  Write a program that declares two integer variables, assigns an integer to each,
            and adds them together. Assign the sum to a variable. Print out the result.
         */

        int a = 1;
        int b = 2;
        int sum1 = a + b;

        System.out.println("The sum of a and b is " + sum1);

        /*
        2.  Write a program that declares two double variables,
            assigns a number to each, and adds them together. Assign the sum to a variable. Print out the result.
         */

        double c = 1;
        double d = 2;
        double sum2 = 1 + 2;

        System.out.println("The sum of c and d is " + sum2);


        /*
        3.  Write a program that declares an integer variable and a double variable, assigns numbers to each,
            and adds them together. Assign the sum to a variable. Print out the result. What variable type must the sum be?
         */

        int e = 1;
        double f = 2.0;

        double sum3 = e + f;

        System.out.println("The sum of e and f is " + sum3);
        // The sum must be of double

        /*
        4.  Write a program that declares two integer variables, assigns an integer to each, and divides the larger
            number by the smaller number. Assign the result to a variable.
            Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?
         */

        int g = 1;
        int h = 2;

        int quotient = h/g;

        System.out.println("The quotient is " + quotient);

        // Changing larger number to decimal
        double j = 2.0;

        // The quotient's datatype cannot be the integer since there is one variable that is off double datatype
        // int quotient = j/g; --> This shows compilation error

        // Corrected by changing the result's datatype to double instead of integer
        double quotient2 = j/g;

        System.out.println("The quotient is " + quotient2);

        /*
        5.  Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number.
            Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.
         */

        double k = 1;
        double l = 2;

        double quotient3 = l/k;

        System.out.println("The quotient is " + quotient3);

        // Typecasting the quotient3 of double datatype into integer
        int quotient4 = (int)quotient3;

        System.out.println("The quotient is " + quotient4);

        /*
        6.  Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y.
            Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again.
         */
        int x = 5;
        int y = 6;
        int q = y/x;

        System.out.println("The value of q is " +  q);

        // casting y to double and assigning to q
        // compilation error occurred
        // q = (double) y;

        //System.out.println(q);

        /*
        7.  Write a program that declares a named constant and uses it in a calculation. Print the result.
         */

        final double PI = 3.14;
        double radius = 3;
        double area = PI * radius * radius;

        System.out.println("The area is " + area);

        /*
        8. Write a program where you create three variables that represent products at a cafe. The products could be beverages like coffee,
           cappuccino, espresso, green tea, etc. Assign prices to each product. Create two more variables called subtotal and
           totalSale and complete an “order” for three items of the first product, four items of the second product, and
           two items of the third product. Add them all together to calculate the subtotal. Create a constant called SALES_TAX
           and add sales tax to the subtotal to obtain the totalSale amount. Be sure to format the results to two decimal places.
         */

        double coffee = 3.0;
        double cappuccino = 4.0;
        double espresso = 6.00;

        double subTotal;
        double totalSale;

        subTotal = 3 * coffee + 4 * cappuccino + 2 * espresso;

        final double SALES_TAX = 7.999999;

        totalSale = subTotal + ((SALES_TAX/100) * subTotal);

        // formatting
        DecimalFormat df = new DecimalFormat("#.##");

        String formattedTotalSale = df.format(totalSale);

        // converting formattedTotalSale back into the double
        double doubleTotalSale = Double.parseDouble(formattedTotalSale);

        // printing the total sale
        System.out.println("Total Sale: $" + doubleTotalSale);






    }
}
