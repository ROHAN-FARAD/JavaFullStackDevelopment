class SwapDemo{
    public static void main(String[] args) {
        int a=10;
        int b=5;
        
        System.out.println("Before Swapping:" + a);
        System.out.println("Before Swapping:"+b);
            int temp=a;
            a=b;
            b=temp;
            System.out.println("After Swapping:" + a);
            System.out.println("After Swapping:" + b);
        
    }
}