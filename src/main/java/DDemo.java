import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/9/20.
 */
public class DDemo<D extends List> {
    D arrayList;

    public D getArrayList() {
        return arrayList;
    }

    public void setArrayList(D arrayList) {
        this.arrayList = arrayList;
    }

    public static void main(String[] args) {
        DDemo<ArrayList<String>> demo = new DDemo<ArrayList<String>>();
        demo.setArrayList(new ArrayList<String>());
    }
}
