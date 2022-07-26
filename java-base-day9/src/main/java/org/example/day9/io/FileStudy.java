package org.example.day9.io;

import java.io.*;

public class FileStudy {
    public static void main(String[] args) {
        File file = new File("C:\\Project\\scu-yang\\java-base\\java-base-day9\\src\\main\\java\\org\\example\\day9\\");
        System.out.println(file.getName());
        if (file.isDirectory()) {
            System.out.println("是目录");
            System.out.println("目录下的文件：");
            File[] files = file.listFiles();
            for (File f : files) {
                System.out.println(f.getName());
            }
        } else {
            System.out.println("不是目录");
        }
        System.out.println( File.listRoots()[0].getAbsolutePath());

        String content = "11111111";
        File file2 = new File("C:\\Project\\scu-yang\\java-base\\java-base-day9\\src\\main\\java\\org\\example\\day9\\test");
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file2));
            bufferedWriter.write(content);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File file3 = new File("C:\\Project\\scu-yang\\java-base\\java-base-day9\\src\\main\\java\\org\\example\\day9\\test");
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file3));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
