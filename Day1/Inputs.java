import java.util.*;

public class Inputs {
     //By Using This Methods We Can Give Input For Each DataType.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a byte value: ");
        byte a = sc.nextByte();
        System.out.print("Enter a short value: ");
        short b = sc.nextShort();
        System.out.print("Enter an int value: ");   
        int c = sc.nextInt();
        System.out.print("Enter a long value: ");
        long d = sc.nextLong();
        System.out.print("Enter a float value: ");
        float e = sc.nextFloat();
        System.out.print("Enter a double value: "); 
        double f = sc.nextDouble();
        System.out.print("Enter a char value: ");  
        char g = sc.next().charAt(0);
        System.out.print("Enter a boolean value (true/false): ");
        boolean h = sc.nextBoolean();
        sc.nextLine(); //
        System.out.println("Enter All Paregraph By nextLine");
        String i=sc.nextLine();
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " "+ g +" " + " " + h +""+i);
    }
    }

