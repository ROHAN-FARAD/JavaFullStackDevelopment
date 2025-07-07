public class Fibo {
    public static void main(String[] args) {
        int no = 10;
        printFibo(no);
    }
    public static void printFibo(int n) {
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
