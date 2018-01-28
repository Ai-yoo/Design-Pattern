package demo_abstractfactory;

public class BoatFactory extends AbstractFactory {

    @Override
    public Boat create() {
        return new Boat();
    }
}
