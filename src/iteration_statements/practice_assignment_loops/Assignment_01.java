package iteration_statements.practice_assignment_loops;

public class Assignment_01 {
    public static void main(String[] args){
        for (int i = 1; i <= 12; i++){
            for (int j = 1; j <= 12; j++){
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
