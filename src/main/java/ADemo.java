import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2018/9/20.
 */
public class ADemo {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        l1.add("成员");
        List<?> l2 = l1;
        List<?> l3 = new LinkedList<Integer>();
        l1.set(0,"改变成员");//l2就不能调用set方法
    }
}
