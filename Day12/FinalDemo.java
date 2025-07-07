
public class FinalDemo {
    // final int a = 10; // constant variable
        final void display() { // final method
            System.out.println("byyyyyyyyyyyy");
        }
        public class D extends FinalDemo {
            // Cannot override final method display() from FinalDemo
            // void display() { 
            //     System.out.println("hiiiiiiiiiiiiiii.");
            // }        
            //final void display() { // final method
            //System.out.println("hiiiiiiiiiiiiiii.");
        }

    public static void main(String[] args) {
         FinalDemo f = new FinalDemo ();
         f.display();
    }
}

