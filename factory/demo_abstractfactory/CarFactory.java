package demo_abstractfactory;

public class CarFactory extends AbstractFactory {

    @Override
    public Car create() {
        return new Car();
    }
}
