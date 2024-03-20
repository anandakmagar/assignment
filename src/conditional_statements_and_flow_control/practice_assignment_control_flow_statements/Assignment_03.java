package conditional_statements_and_flow_control.practice_assignment_control_flow_statements;

public class Assignment_03 {
    public static void main(String[] args){
        int x;

        x = 50;

        if (x < 10){
            System.out.println("Less than 10");
        }
        else if (x >= 10 && x < 20){
            System.out.println("Between 10 and 20");
        }
        else {
            System.out.println("Greater than or equal to 20");
        }
    }
}
