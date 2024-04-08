package functional_programming_and_lambda_expressions.practice_problems.lamda_expressions;

@FunctionalInterface
interface A {
    void sayHi();
}
public class PracticeProblem01 {
    public static void main(String[] args) {
        A a = () -> System.out.println("Hi!");

        a.sayHi();
    }
}
