package demo_samplefactory;

public class Customer {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Product car = factory.create("汽车");
        Product boat = factory.create("小船");
        Product plane = factory.create("飞机");
    }
}
