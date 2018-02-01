package demo_strategy;

public class Client {
    public static void main(String[] args) {
        //创建低级会员
        SMemeber s = new SMemeber();
        //创建中级会员
        MMember m = new MMember();
        //创建高级会员
        BMember b = new BMember();
        //运用低级会员的优惠策略
        Price price1 = new Price(s);
        //运用中级会员优惠策略
        Price price2 = new Price(m);
        //运用高级会员优惠策略
        Price price3 = new Price(b);
        System.out.println("图书原价：100元");
        System.out.println("低级会员价："+price1.sale(100));
        System.out.println("中级会员价："+price2.sale(100));
        System.out.println("高级会员价："+price3.sale(100));

    }
}
