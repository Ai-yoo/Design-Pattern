package demo_adapter1;

public class Adapter implements Target {

    private Adaptee adpaptee;

    public Adapter(Adaptee adpaptee) {
        this.adpaptee = adpaptee;
    }


    public void function1() {
        this.adpaptee.function1();
    }

    public void function2() {
        System.out.println("Adapter的function2方法");
    }

}
