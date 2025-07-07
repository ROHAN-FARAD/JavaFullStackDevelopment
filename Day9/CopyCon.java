public class CopyCon {
    String name;
    int age;
    // Parameterized constructor
    CopyCon(String n, int a) {
        this.name = n;
        this.age = a;
    }
    // Copy constructor
    CopyCon(CopyCon s) {
        this.name = s.name;
        this.age = s.age;
    }
    void display() {
        System.out.println(name + " - " + age);
    }
    public static void main(String[] args) {
        CopyCon s1 = new CopyCon("Rohan", 20);  
        CopyCon s2 = new CopyCon(s1);           

        s1.display();
        s2.display();
    }
}
