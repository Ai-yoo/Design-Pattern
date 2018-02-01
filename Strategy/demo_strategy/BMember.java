package demo_strategy;

/*
*高级会员，折扣30%
*/
public class BMember implements Strategy {

    @Override
    public double saleprice(double price) {
        return price * (1 - 0.3);
    }

}
