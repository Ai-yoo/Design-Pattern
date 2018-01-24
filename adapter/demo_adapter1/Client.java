package demo_adapter1;

public class Client {

    public static void main(String[] args) {
        Adaptee a = new Adaptee();
        Adapter adapter = new Adapter(a);
        adapter.function1();
        adapter.function2();
    }
}
