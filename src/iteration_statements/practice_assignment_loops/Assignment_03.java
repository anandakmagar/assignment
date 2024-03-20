package iteration_statements.practice_assignment_loops;

public class Assignment_03 {
    public static void main(String[] args){
        double currentTuition = 10000;
        double increasedRate = 0.07;
        int numberOfYears = 0;

        while (currentTuition <= 20000){
            currentTuition = currentTuition + (increasedRate * currentTuition);
            numberOfYears++;
        }

        System.out.println("It will take " + numberOfYears + " years for tuition to be doubled");
    }
}
