public class Matrix {
    public static void main(String[] args) {
       
        int[][] matrix = {
            {1, 2,3},
            {3, 4,5},
            {5, 6,6}
            
        };
        System.out.println("4x2 Matrix:");
        for (int i = 0; i < 3; i++) {         
            for (int j = 0; j < 3; j++) {     
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();  
        }
    }
}
