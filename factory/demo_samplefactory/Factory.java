package demo_samplefactory;

public class Factory {

    public Factory() {
    }

    public Product create(String product) {
        if (product.equals("飞机")) {
            return new Plane();
        }
        if (product.equals("小船")) {
            return new Boat();
        }
        if (product.equals("汽车")) {
            return new Car();
        }
        return null;
    }
}
