package demo_abstractfactory;


public class Customer {

    public static void main(String[] args) {
        CarFactory c = new CarFactory();
        Car car = c.create();

        BoatFactory b = new BoatFactory();
        Boat boat = b.create();

        PlaneFactory p = new PlaneFactory();
        Plane plane = p.create();
    }
}
