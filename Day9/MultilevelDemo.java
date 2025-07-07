class A{
    void dis(){
        System.out.println("hiii");
    }
}
class B extends A{
    void put(){
    System.out.println("Byyyyy");
    }
}
class C extends  B{
    void show(){
        System.out.println("Goooo");
    }
}
public class MultilevelDemo {
    public static void main(String[] args) {
    C c1 = new  C();
    c1.put();
    c1.dis();
    c1.show();

    }
}
