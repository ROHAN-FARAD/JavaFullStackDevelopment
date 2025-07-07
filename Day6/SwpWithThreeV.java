public class SwpWithThreeV {
    public static void main(String[] args) {
        swapDemo(1, 2);
    }
    public static void swapDemo(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a + " " + b );
    }
}
