public class PrimeNo {
    public static void main(String[] args) {
   PrimeNo p1 = new PrimeNo();
   p1.prime(1);
    
    }
    void prime(int no)
    {

    //boolean counter=true;
    int temp=0;

        
        for(int i=2;i<no;i++)  
        {
            if(no%2==0)
            {
                temp++;
                break;
            }
        }
        if(temp==1)
        {
            System.out.println(" Prime");
        }else{
            System.out.println(" Not Prime");
        }
        
    }
    }
