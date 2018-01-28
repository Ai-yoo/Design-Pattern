package demo_abstractfactory;

public class PlaneFactory extends AbstractFactory {

    @Override
    public Plane create() {
        return new Plane();
    }

}
