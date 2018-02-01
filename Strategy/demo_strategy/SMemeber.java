package demo_strategy;
/*
*初级会员优惠折扣10%
*/
public class SMemeber implements Strategy {

    @Override
    public double saleprice(double price) {
        return price * (1 - 0.1);
    }
}
