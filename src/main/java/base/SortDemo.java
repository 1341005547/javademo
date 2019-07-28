package base;

import org.junit.Test;

/**
 * Created by Administrator on 2018/9/17.
 */
public class SortDemo {
    /**
     * 冒泡排序
     */
    @Test
    public void method1(){
        int[] array = {1,5,23,53,12};
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length  -1 -i; j++) {
                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        print(array);
    }

    /**
     * 直接排序
     */
    @Test
    public void method2(){
        int[] array = {1,5,23,53,12};
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if (array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        print(array);
    }

    /**
     * 打印数组
     */
    private void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    /**
     * 反转排序
     */
    @Test
    public void reverse(){
        int temp = 0;
        int[] array = new int[]{1,2,3,4,5};
        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
        print(array);
    }
    /**
     * 数组复制
     */
    @Test
    public void copy(){
        int[] array = new int[]{0,1,2,3,4,5};
        int beginIndex = 1;
        int endIndex = 3;
        int j = 0;
        int[] arrayCopy = new int[endIndex - beginIndex + 1];
        for (int i = beginIndex; i < endIndex+1; i++) {
            arrayCopy[j++] = array[i];
        }
        print(array);
        print(arrayCopy);
    }
    /**
     * 输出数组中最小的元素
     */
    @Test
    public void findMin(){
        int[] array = {-1, 2, 1, -25};
        int temp = array[0];
        for (int i = 0; i < array.length; i++) {
            if (temp > array[i]){
                temp = array[i];
            }
        }
        System.out.println(temp);
    }
    /**
     * 转置
     */
    @Test
    public void transposition(){
        int[][] array = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] arrayCopy = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                arrayCopy[j][i] = array[i][j];
            }
        }
        System.out.println(arrayCopy);
    }

}
