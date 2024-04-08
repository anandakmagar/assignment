package functional_programming_and_lambda_expressions.practice_problems.lamda_expressions;

@FunctionalInterface
interface E {
    void add(int a, int b);
}

public class PracticeProblem05 {
    public static void main(String[] args) {
        ((E)(a, b) -> System.out.println(a + b)).add(3, 5);
    }
}
