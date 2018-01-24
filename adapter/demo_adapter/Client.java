package demo_adapter;

public class Client {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.function1();
        target.function2();
    }
}
