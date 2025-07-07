
import java.util.Scanner;

public  class EvenOdd{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Any No: ");
            int n=sc.nextInt();
      evenDemo(n);
        }
    }
//  Generate copy Call By Value.......
public static void evenDemo(int no){

        if(no%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
 }
