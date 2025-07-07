class MaxEleInArray{
    public static void main(String[] args) {
        int arr[]={5,2,80,1,8};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
            max=arr[i];
           
        }
        System.out.println(max);
    }
}