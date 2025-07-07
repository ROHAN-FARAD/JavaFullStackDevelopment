class Parent {
    void dis() {
        System.out.println("I Am Parent Method");
    }
}
class Child extends Parent {
    void put() {
        System.out.println("I Am Child Method");
    }
}
public class Main {
    public static void main(String[] args) {
        Child c1 = new Child(); 
        c1.dis();               
        c1.put();               
    }
}
