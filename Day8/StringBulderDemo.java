public class StringBulderDemo {
    public static void main(String[] args) {
    StringBuilder s = new StringBuilder("abc");
   // String name="Rohan";
        // System.out.println(str.charAt(1));
    //System.out.println(s.insert(3,'c'));
    // s.setCharAt(1, 'M');
    // System.out.println(s);
    // s.delete(0, 3);

    // System.out.println(s.append("r"));
    // s.reverse();
    // System.out.println(s);
    for(int i=0;i<s.length()/2;i++){
        int front=i;    // a
        int back=s.length()-i-1;//c
        char frontchar=s.charAt(front);//0-a
        char backchar=s.charAt(back);//2-c
        s.setCharAt(front, backchar);//c
        s.setCharAt(back, frontchar);//a
    }
    System.out.println(s);

    
    }
}
