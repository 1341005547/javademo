package base;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Administrator on 2018/9/17.
 */
public class ArrayDemo {

    /**
     * 声明和初始化数组
     */
    @Test
    public void initalArray(){
        //声明和初始化
        int array[]= {1,2,3};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * 二维数组的创建和使用
     */
    @Test
    public void twoDimensionArray(){
        String[][]  array = new String[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = ""+i+""+j;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j]+ " ");

            }
            System.out.println();
        }
    }
    /**
     * 二维数组的梯形
     */
    @Test
    public void arrayUse(){
        int[][] array = {{1,2},{3,4,5}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(""+array[i][j]+" ");
            }
            System.out.println();
        }
    }


}
