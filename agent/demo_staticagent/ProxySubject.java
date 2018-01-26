package demo_staticagent;

public class ProxySubject implements AbstractSubject {

    private AbstractSubject abstractSubject;

    public ProxySubject(AbstractSubject abstractSubject) {
        this.abstractSubject = abstractSubject;
    }


    @Override
    public void sing() {
        abstractSubject.sing();
    }
}
