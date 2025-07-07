public class Conditional {
    public static void main(String[] args) { 
     //if-statement
     //if-else
     //else-if
     //nested-if
     //for-loop
     //while-loop
     //do-while-loop

    int a=10;
    int b=5;
    if(a>b){
        System.out.println("A is greater!!!");
    }
    int a1=10;
    int b1=15;
    if(a1>b1){
        System.out.println("A is greater!!!");
    }else{
        System.out.println("B is greater!!!");
    }
    int x=0;
    if(x>0){
        System.out.println("Possitive no!!!");
    }else if(x<0){
        System.out.println("Negative no!!!");
    }else{
        System.out.println("No neither possitive no negtive!!it is zero");
    }
    //loops
    for(int i=0;i<4;i++){
        System.out.println("Rohan");
    }
    int y=0;
    while(y<=5){
        System.out.println("equal to"+y);
        y++;
    }
    do { 
        
        System.out.println("Hii");
        x++;
    } while (x<2);

    int count=5;
    while(count>0){
        System.out.println(count);
        count--;
    }
    System.out.println("Happy New Year!!!!!");
    }
}
