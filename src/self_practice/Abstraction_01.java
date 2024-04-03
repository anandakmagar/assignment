package self_practice;

// Abstraction is the process of hiding the implementation details by only showing the essentials details (abstract information)
// We created the below abstract class to only show the abstract (outer cover) to the oustide classes, it doesnt have implementation details
// In the below example, we have created the abstract class Animal_02 where we have one abstract method called makeSound()
// Note: In abstract class, we can use both abstract and non-abstract (concrete method that has implementation)

// In Java, when we create the abstract class, it lets us use the class as the abstract class, where we can put abstract methods
// Abstract methods are those that do not have any implementation
// makeSound() is the abstract method as you can see it, it doesnt have any implementation details. This is the empty method
// This method can be implemented by its child classes where it will have its implementation

abstract class Animal_02 {
    // This is an abstract method that has no implementation details. This can be implemented by this class's child classes. ie. Cat_02 that extends Animal_02
    public abstract void makeSound();
}

// Now we can implement the abstract methods in the above class as our class Cat_02 extends Animal_02 that has the abstract method
// This is called overriding the method
class Cat_02 extends Animal_02 {

    // Now, we are overriding the abstract method and have our own implementation
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
