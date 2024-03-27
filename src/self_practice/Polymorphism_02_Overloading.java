package self_practice;
class Calculator {
    int a;
    int b;
    int c;

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c){
        System.out.println(a + b + c);
    }
}
public class Polymorphism_02_Overloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(3, 2);
        calculator.add(1, 2, 3);
    }
}
