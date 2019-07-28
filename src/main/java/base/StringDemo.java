package base;

import org.junit.Test;

import java.util.Date;

/**
 * Created by Administrator on 2018/9/11
 * 测试字符串的方法.
 */
public class StringDemo {

    /**
     * 创建字符串
     */
    @Test
    public void buildStringTest(){
        //通过char字符进行字符串创建
        char[] a = {'g','o','o','d'};
        String str = new String(a);
        System.out.println(str);
        //通过字面字符进行字符串创建
        String string = new String("good");
        System.out.println("测试两种方法是否是=："+(str == string));
    }
    /**
     * 字符串连接
     */
    @Test
    public void concatString(){
        //测试换行效果--没有出现换行的效果
        String str1 = "abc";
        String str2 = "def";
        System.out.println("i like"+
        "java");
        //字符串连接其他类型的内容
        String str3 = "";
        System.out.println(str3+12F);
    }
    /**
     * 获取字符串信息
     */
    @Test
    public void stringMsg(){
        String string = "ab 12 AB";
        System.out.println("打印字符串的长度"+string.length());
    }
    /**
     * 字符串查找
     */
    @Test
    public void findString(){
        String string = "abcde 1234";
        System.out.println("获得指定字符串位置"+string.indexOf("12"));
        System.out.println("获得下标为3位置的字符"+string.charAt(3));
    }
    /**
     * 字符串操作
     */
    @Test
    public void operationString(){
        String string =  "dmxfqwnj@126.com";
        ;
        System.out.println("截取后的字符串:"+string.substring(8,12));
        System.out.println("原字符串为"+string);
    }
    /**
     * 去除空格
     */
    @Test
    public void trimString(){
        String string = " ab c ";
        System.out.println("去除字符串两端的空格"+string.trim());
        System.out.println("去除字符串的所有空格"+string.replace(" ",""));
        System.out.println("原字符串"+string);
    }
    /**
     * 替换
     */
    @Test
    public void replaceStrng(){
        String string = "abcd 1234";
        System.out.println(string.replace(" 1234","wnj"));
    }
    /**
     * 字符串的开始比较，尾部比较，忽略大小写的比较
     */
    @Test
    public void equalString(){
        String string = "abcd 1234";
        String start = "ab";
        String end = "34";
        System.out.println("比较字符串开始："+string.startsWith(start));
        System.out.println("比较字符串结尾："+string.endsWith(end));
        System.out.println("忽略大小写的比较："+"ABCD 1234".equalsIgnoreCase(string));
    }
    /**
     * 自然排序
     */
    @Test
    public void compareString(){
        String string1 = "ab";
        String string2 = "bc";
        System.out.println(string2.compareTo(string1));
    }
    /**
     * 字符串大小写转化，分隔
     */
    @Test
    public void operateString(){
        String string = "1234";
        String str = "ba,s=df";
        System.out.println("字符串进行小写转化为大写的操作，转化后的结果："+str.toUpperCase());
        System.out.println("字符串进行小写转化为大写的操作，转化前的内容："+str);
        String[] strings = str.split(",|=");
        System.out.println(strings);
    }
    /**
     * 字符串格式化
     */
    @Test
    public void formatString(){
        Date date = new Date();
        System.out.println("一个月中的某一天（12）："+String.format("%te",date));
        System.out.println("一年中的月份（9月）："+String.format("%tb",date));
        System.out.println("一年中的月份全程（9月）："+String.format("%tB",date));
        System.out.println("星期的简称（周三）："+String.format("%ta",date));
        System.out.println("星期的全称（周三）："+String.format("%tA",date));
        System.out.println("包括全部日期和时间信息："+String.format("%tc",date));
        System.out.println("4位年份："+String.format("%tY",date));
        System.out.println("一年中的第几天："+String.format("%tj",date));
        System.out.println("月份："+String.format("%tm",date));
        System.out.println("一个月中的第几天："+String.format("%td",date));
        System.out.println("两位年份："+String.format("%ty",date));
    }
    /**
     * 字符串生成工具
     */
    @Test
    public void stringGeneral(){
/*        String string = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            string = string+i;
        }
        System.out.println("没有使用字符串构造器，拼接字符串10000次耗时："+(System.currentTimeMillis()-startTime));*/
        StringBuilder buildString = new StringBuilder("");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            buildString = buildString.append(i);
        }
        System.out.println("使用字符串构造器，拼接字符串10000次耗时："+(System.currentTimeMillis()-start));
    }

}
