package self_practice;

class Animal_03 {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Animal_03 animal = new Animal_03();
        animal.setName("Cat");
        System.out.println(animal.getName());
    }
}
