package org.example.day9.io;

import java.io.*;

public class ImageFile {
    private static final String scrImagePath = "C:\\Users\\zjianfa\\Desktop\\工作簿1.xlsx";
    private static final String outImagePath = "C:\\Users\\zjianfa\\Desktop\\工作簿2.xlsx";

    public static void main(String[] args) {
        // 读入图片
        File originalFile = new File(scrImagePath);//指定要读取的图片
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            File result = new File(outImagePath);//要写入的图片
            if (result.exists()) { //校验该文件是否已存在
                result.delete(); //删除对应的文件，从磁盘中删除
                result = new File(outImagePath);//只是创建了一个File对象，并没有在磁盘下创建文件
            }
            if (!result.exists()) {//如果文件不存在
                result.createNewFile();//会在磁盘下创建文件，但此时大小为0K
            }

            in = new FileInputStream(originalFile);
            out = new FileOutputStream(result);// 指定要写入的图片
            int n = 0;// 每次读取的字节长度
            byte[] buffer = new byte[2048];// 存储每次读取的内容
            while ((n = in.read(buffer)) != -1) {
                out.write(buffer, 0, n); // 将读取的内容，写入到输出流当中
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //执行完以上后，磁盘下的该文件才完整，大小是实际大小
            try {
                out.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
