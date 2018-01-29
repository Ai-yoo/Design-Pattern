package demo_zeren;

/**
 * Created with IDEA
 * author:DuzhenTong
 * Date:2017/11/14
 * Time:18:37
 */
public abstract class Handler {
    /**
     * 对下一个处理角色的引用
     */
    public Handler handler = null;

    /**
     * 获取下一个的引用
     *
     * @return
     */
    public Handler getHandler() {
        return handler;
    }

    /**
     * 设置下一个角色的引用
     *
     * @param handler
     */
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    /**
     * 处理问题的方法
     * @param different 难度系数
     * @return 结果
     */
    public abstract String result(int different);


}
