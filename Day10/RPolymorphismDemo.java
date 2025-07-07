
public class RPolymorphismDemo {

    void dis() {
        System.out.println("hiiiiii");
    }

    static class B extends RPolymorphismDemo {

        @Override
        void dis() {
            System.out.println("Byyyyyy");
        }
    }

    public static void main(String[] args) {
        RPolymorphismDemo obj = new B();
        obj.dis();
    }
}
