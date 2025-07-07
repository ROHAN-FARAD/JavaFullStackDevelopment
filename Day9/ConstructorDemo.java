public class ConstructorDemo {
    //default
    //instance variable
    public String name;
    public int Age;
    ConstructorDemo(String n,int a){
        this.name=n;
        this.Age=a;
        System.out.println("Hii My Name Is Rohan");
    }
    void dis(){
        System.out.println(name);
        System.out.println(Age);
    }
    public static void main(String[] args) {
        ConstructorDemo c1= new ConstructorDemo("Rohan",20);
        c1.dis();
       
        
    
        
    }
}
