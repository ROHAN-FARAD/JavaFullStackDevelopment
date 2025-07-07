
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Arrays;

public class CollectionDemo {
    public static void main(String[] args) {

        ArrayList<Integer> l1= new ArrayList<>(10);
        l1.add(10);
        l1.add(20);
        l1.add(0);
        l1.add(40);
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(40);
        l1.add(40);
        l1.add(40);    
        l1.add(40);
       Collections.sort(l1);
       System.out.println(l1);
        
        /*
        l1.remove(0);
        System.out.println(l1.contains(10));
        l1.set(1, 100);
        l1.add(1,90);
        for(int x:l1){
            System.out.println(x);
        }
 */
    
        }

    }

