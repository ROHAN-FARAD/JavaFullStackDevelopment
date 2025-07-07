class ReverseArray{
    public static void main(String[] args) {
        int arr[]={5,3,7,1,8};
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int num:arr){
            System.out.print(" "+num);
        }
    }
}