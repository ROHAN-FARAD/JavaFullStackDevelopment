abstract class Animal {
    
    abstract void makeSound();
    void sleep() {
        System.out.println("Sleeping...");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
public class TestAbstract {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.makeSound(); 
        d.sleep();     
    }
}
