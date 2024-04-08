package functional_programming_and_lambda_expressions.practice_problems.lamda_expressions;

@FunctionalInterface
interface D {
    int add(int a, int b);
}

public class PracticeProblem04 {
    public static void main(String[] args) {
        D d = (a, b) -> a + b;

        System.out.println(d.add(3, 5));
    }
}
