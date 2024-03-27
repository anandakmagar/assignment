package self_practice;

class Animal_04 {
    public void makeSound(){
        System.out.println("Animal makes sound");
    }
}

class Cat_04 extends Animal_04 {
    @Override
    public void makeSound(){
        System.out.println("Cat makes sound meow");
    }
}
public class Polymorphism_01_Overriding{
    public static void main(String[] args) {
        Cat_04 cat = new Cat_04();
        cat.makeSound();

    }
}
