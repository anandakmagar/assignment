package functional_programming_and_lambda_expressions.practice_problems.lamda_expressions;

@FunctionalInterface
interface C {
    void add(int a, int b);
}
public class PracticeProblem03 {
    public static void main(String[] args) {
        C c = (a, b) ->System.out.println(a+b);

        c.add(2, 3);
    }
}
