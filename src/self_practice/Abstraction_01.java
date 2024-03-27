package self_practice;

abstract class Animal_02 {
    public abstract void makeSound();
}

class Cat_02 extends Animal_02 {

    @Override
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
public class Abstraction_01 {
    public static void main(String[] args) {
        Cat_02 cat = new Cat_02();
        cat.makeSound();
    }
}
