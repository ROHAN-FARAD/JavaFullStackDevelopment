//We can achive 100% Abstraction;
//There are no any non abstract method;
//no constructor;
//usee impliments keyword;
//support multiple inheritance;
interface  InterfaceDemo {
    void  show();
   
class a implements InterfaceDemo{
    @Override
    public void show(){
        System.out.println("hiiiiiiiiii");
    }
}    
    public static void main(String[] args) {
          a a1 = new a();
          a1.show();
    }
}
