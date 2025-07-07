
public class TypePromotion {    
    public static void main(String[] args) {
        // Type Promotion in Java
        // When we perform arithmetic operations on mixed data types, Java promotes the smaller data types to the larger data type.
        
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 30;
        long longValue = 40L;
        float floatValue = 50.5f;
        double doubleValue = 60.5;

        // Example of type promotion
        double result = byteValue + shortValue + intValue + longValue + floatValue + doubleValue;

        System.out.println("Result of type promotion: " + result);
        // Demonstrating type promotion in arithmetic operations
        // When byte, short, int, long, float, and double are involved in an arithmetic operation,
        // the result is promoted to the largest data type in the operation.        

    }
}

