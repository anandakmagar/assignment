package functional_programming_and_lambda_expressions.practice_problems.lamda_expressions;

@FunctionalInterface
interface F {
    void concatString(String a, String b, String c);
}
public class PracticeProblem06 {
    public static void main(String[] args) {
        ((F)(a, b, c) -> System.out.println(a+b+c)).concatString("Hello ","PerScholas ","Students");
    }
}
