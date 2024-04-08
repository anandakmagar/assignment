package functional_programming_and_lambda_expressions.practice_problems.lamda_expressions;

@FunctionalInterface
interface G {
    double calculate(double a, double b, double c);
}
public class PracticeProblem07 {
    public static void main(String[] args) {
        System.out.println(((G)(a, b, c) -> a+b+c).calculate(3, 4, 5));
    }
}
