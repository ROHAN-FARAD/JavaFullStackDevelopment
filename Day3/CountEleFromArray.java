class CountEleFromArray{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,11};
        int evencounter=0;
        int oddcounter=0;
        for(int no:arr)
        {
            if(no%2 == 0){
                evencounter++;
            }else{
                oddcounter++;
            }
        }
        System.out.println("Even number count :"+evencounter);
        System.out.println("Odd number count :"+oddcounter);
        
    }
}