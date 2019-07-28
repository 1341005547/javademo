/**
 * Created by Administrator on 2018/9/20.
 */
public class EnumDemo {
    enum Constants2{
        CONSTANTS_A("我是枚举量A"),
        CONSTANTS_B("我是枚举量B"),
        CONSTANTS_C("我是枚举量C"),
        CONSTANTS_D(3);

        String description;
        int i = 0;

        private Constants2(String description) {
            this.description = description;
        }
        private Constants2(int i){
            this.i = ++i;
        }

        public String getDescription() {
            return description;
        }

        public int getI() {
            return i;
        }

        public static void main(String[] args) {
            System.out.println(Constants2.valueOf("CONSTANTS_D").getI());
        }
    }
}
