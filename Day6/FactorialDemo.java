public class FactorialDemo{
    public static void main(String[] args) {
    
        calfactorial(5);
       
        
    }
    public static void calfactorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f=f * i;
        }
        System.out.println("Factorial of " + n + " is: " + f);

    }
}