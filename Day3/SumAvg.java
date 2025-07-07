public class SumAvg {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=0;
        int avg = 0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            avg=sum/5;


        }
        System.out.println(sum);
        System.out.println(avg);
    }
}
