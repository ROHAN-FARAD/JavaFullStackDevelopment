public class ContainsEleInArray {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6};
        int sele=5;
        boolean found=false;
        for(int ano:arr)
        {
            if(ano==sele)
            {
                found=true;
                break; 
            }
        }
            if(found){
                System.out.println("Found");
            }else{
                System.out.println("Not Found");
            }
        }

    }

