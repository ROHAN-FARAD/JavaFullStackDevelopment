public class PalindromeNo {
    public static void main(String[] args) {
        int number = 131;
        int temp = reverseNumber(number);
        System.out.println("Reversed number: " + temp);

        if (number == temp) {
            System.out.println(number + " is a Palindrome Number.");
        } else {
            System.out.println(number + " is NOT a Palindrome Number.");
        }
    }

    
    public static int reverseNumber(int num) {
        int reverse = 0;

        while(num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return reverse;
    }
}
