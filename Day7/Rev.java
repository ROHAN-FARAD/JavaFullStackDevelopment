public class Rev {
    public static void main(String[] args) {
        int number = 2953;
        int reversed = reverseNumber(number);
        System.out.println("Reversed number: " + reversed);
    }

    
    public static int reverseNumber(int num) {
        int reverse = 0;

        while(num != 0) {
            int digit = num % 10;  //2953>0 rem=3,295>0 rem=5
            reverse = reverse * 10 + digit;//0*10+rem=3,
            num = num / 10;//3592/10
        }

        return reverse;
    }
}
//3592