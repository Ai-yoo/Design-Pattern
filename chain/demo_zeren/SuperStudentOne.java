package demo_zeren;

/**
 * Created with IDEA
 * author:DuzhenTong
 * Date:2017/11/14
 * Time:18:44
 */
public class SuperStudentOne extends Handler {

    /**
     * 结果
     */
    String result = "";

    @Override
    public String result( int different) {
        //当问题难度系数是学霸1的范围时处理
        if (different <= 2) {
            result = "学霸1处理了难度系数为" + different + "的问题!";
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
