package io;

import org.junit.Test;

import java.io.*;

import static jdk.nashorn.internal.objects.NativeError.getFileName;

/**
 * Created by Administrator on 2018/9/19.
 */
public class IoDemo {
    /**
     * 文件对象的创建
     */
    @Test
    public void createFile(){
        File file = new File("test.txt");
        if (file.exists()){
            file.delete();
        }else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 遍历文件
     */
    @Test
    public void allFile(){
        String path = "D:\\新建文件夹 (2)";
        File file =new File(path);
        this.getFileName(file);
    }

    private void getFileName(File file) {
        System.out.println(file.getName());
        if (!file.isDirectory()){
        }else {
            for (int i = 0; i < file.list().length; i++) {
                getFileName(file.listFiles()[i]);
            }
        }
    }

    /**
     * 获取文件的基本信息
     */
    @Test
    public void getBaseMsg(){
        File file = new File("test.txt");
        if (file.exists()){
            System.out.println("文件名："+file.getName());
            System.out.println("文件绝对路径:"+file.getAbsolutePath());
            System.out.println("文件长度内容的长度:"+ file.length());
            System.out.println("文件转为url："+file.toURI());
        }else {
            System.out.println("文件并不存在");
        }
    }
    /**
     * 利用输入流和输出流
     */
    @Test
    public void inputOutput(){
        //利用输入流向文件中输入内容
        try {
            String s = "abcdefg";
            FileOutputStream out = new FileOutputStream(new File("test.txt"));
            byte[] array = s.getBytes();
            out.write(array);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 获取文件中的内容
     */
    @Test
    public void getMsg(){
        try {
            byte[] array = new byte[1];
            FileInputStream input = new FileInputStream(new File("test.txt"));
            while (input.read(array) >= 0){
                System.out.print(new String(array));
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
