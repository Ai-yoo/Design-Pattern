package demo_strategy;

public class Price {

    private Strategy strategy;

    public Price(Strategy strategy) {
        this.strategy = strategy;
    }

    //根据传入对象的不同，调用不同的方法，优惠策略
    public double sale(double bookprice) {
        return strategy.saleprice(bookprice);
    }
}
