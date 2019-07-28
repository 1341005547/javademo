/**
 * Created by Administrator on 2018/9/20.
 */
public class TDemo<T> {
    private T[] array;

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public static void main(String[] args) {
        TDemo<String> tDemo = new TDemo();
        tDemo.setArray(new String[]{"aa", "bb"});
    }
}
