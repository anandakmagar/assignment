package encapsulation_and_inheritance.practice_assignment_inheritance_and_overloading_hackerrank.java_inheritance_1;

// https://www.hackerrank.com/challenges/java-inheritance-1/problem

class Animal {
    void walk(){
        System.out.println("I am walking");
    }
}

class Bird extends Animal {
    void fly(){
        System.out.println("I am flying");
    }

    void sing(){
        System.out.println("I am singing");
    }
}


public class JavaInheritance1 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
