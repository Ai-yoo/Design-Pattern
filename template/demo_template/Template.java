package demo_template;

public abstract class Template {

    //服务员为顾客选择座位
    private void selectSeat() {
        System.out.println("选择一个座位");
    }

    //服务员给顾客菜单
    private void passMenu() {
        System.out.println("递菜单");
    }

    //假设顾客只点了A,B,C三个菜
    public abstract void selectA();

    public abstract void selectB();

    public abstract void selectC();

    //服务员提交菜单
    private void submitMenu() {
        System.out.println("提交菜单");
    }

    //上菜
    private void serving() {
        System.out.println("上菜");
    }
    //顾客买单
    private void pay() {
        System.out.println("顾客买单");
    }

    protected void service() {
        selectSeat();
        passMenu();
        this.selectA();
        this.selectB();
        this.selectC();
        submitMenu();
        serving();
        pay();

    }

}
