package conditional_statements_and_flow_control.practice_assignment_control_flow_statements;

import java.util.Scanner;

public class Assignment_07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double taxToPay = 0;

        System.out.println("Menu");
        System.out.println("1. Single");
        System.out.println("2. Married Filing Jointly or Qualifying Widow(er)");
        System.out.println("3. Married Filing Separately");
        System.out.println("4. Head of Household");

        System.out.println();

        System.out.println("Please enter the filing status");
        int status = scanner.nextInt();

        System.out.println("Please enter the income");
        int income = scanner.nextInt();

        if (status == 1 && income >= 0 && income <= 8350){
            taxToPay = 0.10 * income;
            System.out.println("Tax rate is 10%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }

        else if (status == 1 && income >= 8351 && income <= 33950){
            taxToPay = 0.15 * income;
            System.out.println("Tax rate is 15%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }

        else if (status == 1 && income >= 33951 && income <= 82250){
            taxToPay = 0.25 * income;
            System.out.println("Tax rate is 25%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }

        else if (status == 1 && income >= 82251 && income <= 171550){
            taxToPay = 0.28 * income;
            System.out.println("Tax rate is 28%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }

        else if (status == 1 && income >= 171551 && income <= 372950){
            taxToPay = 0.33 * income;
            System.out.println("Tax rate is 33%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }

        else if (status == 1 && income <= 372951){
            taxToPay = 0.35 * income;
            System.out.println("Tax rate is 35%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }


        if (status == 2 && income >= 0 && income <= 16700){
            taxToPay = 0.10 * income;
            System.out.println("Tax rate is 10%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }

        else if (status == 2 && income >= 16701 && income <= 67900){
            taxToPay = 0.15 * income;
            System.out.println("Tax rate is 15%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }

        else if (status == 2 && income >= 67901 && income <= 137050){
            taxToPay = 0.25 * income;
            System.out.println("Tax rate is 25%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }

        else if (status == 2 && income >= 137051 && income <= 208850){
            taxToPay = 0.28 * income;
            System.out.println("Tax rate is 28%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }

        else if (status == 2 && income >= 208851 && income <= 372950){
            taxToPay = 0.33 * income;
            System.out.println("Tax rate is 33%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }

        else if (status == 2 && income <= 372951){
            taxToPay = 0.35 * income;
            System.out.println("Tax rate is 35%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }



        if (status == 3 && income >= 0 && income <= 8350){
            taxToPay = 0.10 * income;
            System.out.println("Tax rate is 10%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }

        else if (status == 3 && income >= 8351 && income <= 33950){
            taxToPay = 0.15 * income;
            System.out.println("Tax rate is 15%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }

        else if (status == 3 && income >= 33951 && income <= 68525){
            taxToPay = 0.25 * income;
            System.out.println("Tax rate is 25%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }

        else if (status == 3 && income >= 68526 && income <= 104425){
            taxToPay = 0.28 * income;
            System.out.println("Tax rate is 28%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }

        else if (status == 3 && income >= 104426 && income <= 186475){
            taxToPay = 0.33 * income;
            System.out.println("Tax rate is 33%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }

        else if (status == 3 && income <= 186476){
            taxToPay = 0.35 * income;
            System.out.println("Tax rate is 35%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }


        if (status == 4 && income >= 0 && income <= 11950){
            taxToPay = 0.10 * income;
            System.out.println("Tax rate is 10%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }

        else if (status == 4 && income >= 11951 && income <= 45500){
            taxToPay = 0.15 * income;
            System.out.println("Tax rate is 15%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }

        else if (status == 4 && income >= 45501 && income <= 117450){
            taxToPay = 0.25 * income;
            System.out.println("Tax rate is 25%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }

        else if (status == 4 && income >= 117451 && income <= 190200){
            taxToPay = 0.28 * income;
            System.out.println("Tax rate is 28%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }

        else if (status == 4 && income >= 190201 && income <= 372950){
            taxToPay = 0.33 * income;
            System.out.println("Tax rate is 33%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }

        else if (status == 4 && income <= 372951){
            taxToPay = 0.35 * income;
            System.out.println("Tax rate is 35%");
            System.out.println("Tax to be paid: $" + taxToPay);
        }

    }
}
