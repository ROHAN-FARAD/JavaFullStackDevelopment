public class OOPConceptDemo {
    public String name;
    void set(){
        System.out.println(this.name);
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter Your Name:");
        // name=sc.next();

    }
    void display(){
     
        System.out.println(name);
    }
    public static void main(String[] args) {
    
        OOPConceptDemo o =new OOPConceptDemo();
        o.name="Rohan";
        o.set();
        o.display();
    }
}
