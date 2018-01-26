package demo_proxy;

public class RealSubject implements AbstractSubject {

    @Override
    public void sing() {
        System.out.println("真唱歌");
    }
}
