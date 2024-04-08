package functional_programming_and_lambda_expressions.practice_problems.lamda_expressions;

@FunctionalInterface
interface B {
    void fly();
}

public class PracticeProblem02 {
    public static void main(String[] args) {
        B b = () -> System.out.println("Flying ......");

        b.fly();
    }
}
