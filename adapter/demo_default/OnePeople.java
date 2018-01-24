package demo_default;

public class OnePeople implements Target {

    @Override
    public void study() {
        System.out.println("学");
    }

    @Override
    public void play() {
        System.out.println("玩");
    }

    @Override
    public void eat() {
        System.out.println("吃");
    }

    @Override
    public void sleep() {
        System.out.println("睡");
    }
}
