package io;

import org.junit.Test;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by Administrator on 2018/9/19.
 */
public class IoCacheDemo {
    /**
     * 使用bufferString 处理字符串
     */
    @Test
    public void bufferDemo(){
        String[] s = {"测试buffer","希望可以生效"};
        BufferedWriter  out;
        try {
            FileWriter fw = new FileWriter(new File("test.txt"));
            out = new BufferedWriter(fw);
            for (int i = 0; i < s.length; i++) {
                out.write(s[i]);
            }
            //只有关流或者flush时，才会把字符写入文档中
            out.close();
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     *压缩的输入输出流
     */
    @Test
    public void zipIoDemo(){
        try {
            File file = new File("D:"+File.separator+"workspace"+File.separator+"javademo"+File.separator+"test.txt");
            if (file.exists()){

            }else {
                file.createNewFile();
            }
            FileInputStream in = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(in);
            //1 out.putNextEntry(new ZipEntry(basePath));// 将文件夹放入zip中
            int bat;
            File zipFile = new File("D:"+File.separator+"workspace"+File.separator+"javademo"+File.separator+"test.zip");
            FileOutputStream fo =  new FileOutputStream(zipFile);
            ZipOutputStream zip = new ZipOutputStream(fo);
            zip.putNextEntry(new ZipEntry(zipFile.getName()));
            zip.setComment("测试进行压缩");
            while ((bat = bis.read()) != -1) {
                zip.write(bat); // 将字节流写入当前zip目录
            }
            //2 out.closeEntry();// 关闭zip文件中之前打开的项
            if (bis != null) {
                bis.close();
            }
            if (in != null) {
                in.close();
            }
            if (fo != null){
                fo.close();
            }
            if (zip != null){
                zip.close();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
