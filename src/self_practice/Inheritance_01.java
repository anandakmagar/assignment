package self_practice;

class Animal {
    String species;

    public Animal(String species){
        this.species = species;
    }

    public void introduce(){
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal {
    String name;

    public Cat(String species, String name){
        super(species);
        this.name = name;
        this.species = species;
    }
    @Override
    public void introduce(){
        System.out.println("My name is " + name + " and I am of " + species + " species");
    }
}

public class Inheritance_01 {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat", "Meow Meow");

        cat.introduce();
    }
}
