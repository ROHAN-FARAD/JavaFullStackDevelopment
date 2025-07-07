//It means ability to take more than one form .
//many forms.
//Compile Time Polymorphism.
public class CPolymorphismDemo {
    
     int add(int a,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        
        CPolymorphismDemo p = new CPolymorphismDemo();
        System.out.println(p.add(5, 5));
        System.out.println(p.add(5, 5, 5));
        
    }
    
}

