package demo_zeren;

/**
 * 测试类
 * Created with IDEA
 * author:DuzhenTong
 * Date:2017/11/14
 * Time:18:56
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 组建责任链
         */
        SuperStudentOne s1 = new SuperStudentOne();
        SuperStudentTwo s2 = new SuperStudentTwo();
        s1.setHandler(s2);

        String result1 = s1.result(9);
        System.out.println(result1);

        String result2 = s1.result(6);
        System.out.println(result2);

        String result3 = s1.result(2);
        System.out.println(result3);

        //难度系数为12，超过最大处理的能力
        String result4 = s1.result(12);
        System.out.println(result4);
    }
}
