public class Datatypes {
    //This Ia The DataTye And There Lengths.
    public static void main(String[] args) {
    byte a=127;//1byte=8bit
    short b=32767;//2byte=16bit 
    int c=2147483647;//4byte=32bit
    long d=9223372036854775807L;//8byte=64bit   
    float e=3.4028235E38F;//4byte=32bit
    double f=1.7976931348623157E308;//8byte=64bit
    char g='A';//2byte=16bit    
    boolean h=true;//1bit
    System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h);
    //byte,short,int,long,float,double,char,boolean We Find Si
     System.out.println("Size of byte: " + Byte.BYTES + " bytes");
     System.out.println("Size of short: " + Short.BYTES + " bytes");
     System.out.println("Size of int: " + Integer.BYTES + " bytes");
     System.out.println("Size of long: " + Long.BYTES + " bytes");
     System.out.println("Size of float: " + Float.BYTES + " bytes");
     System.out.println("Size of double: " + Double.BYTES + " bytes");
     System.out.println("Size of char: " + Character.BYTES + " bytes");}
    }


