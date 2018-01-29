package demo_zeren;

/**
 * Created with IDEA
 * author:DuzhenTong
 * Date:2017/11/14
 * Time:18:55
 */
public class SuperStudentThree extends Handler {
    //结果
    String result = "";

    //处理方法
    @Override
    public String result(int different) {
        if (different <= 10) {
            result = "学霸3处理了难度系数为" + different + "的问题!";
        } else {
            //判断后面是否还有处理者，有交给后面，没有返回
            if (getHandler() != null) {
                return getHandler().result(different);
            } else {
                result = "问题太难了!";
            }
        }
        return result;
    }
}
