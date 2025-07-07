public class SwpWithOutTVariable {
    public static void main(String[] args) {
        swapDemo(1, 2);
    }
    public static void swapDemo(int a,int b){
        a = a + b; 
        b = a - b; 
        a = a - b; 
        System.out.println(a + " " + b );
    }
}
