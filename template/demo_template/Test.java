package demo_template;

public class Test {

    public static void main(String[] args) {
        System.out.println("第一位顾客：");
        Template first = new First();
        first.service();
        System.out.println("---------------------");
        System.out.println("第二位顾客：");
        Template second = new Second();
        second.service();
    }
}
