package demo_staticagent;

public class Test {

    public static void main(String[] args) {
        RealSubject reaal = new RealSubject();
        ProxySubject proxy = new ProxySubject(reaal);
        proxy.sing();

    }
}
