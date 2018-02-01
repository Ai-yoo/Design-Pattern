package demo_strategy;
/*
*中级会员，折扣20&
*/
public class MMember implements Strategy {

    @Override
    public double saleprice(double price) {
        return price * (1 - 0.2);
    }
}
