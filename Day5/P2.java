public class P2 {
    public static void main(String[] args) {    
        int m=5;
        int n=4;

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i == 1 || j == 1 || m == i || n == j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
/*
 
****
*  *
*  *
*  *
****
 */



    

