package org.example.day9.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {
        File file = new File("C:\\Project\\scu-yang\\java-base\\java-base-day9\\src\\main\\java\\org\\example\\day9\\11.jpg");

        FileInputStream input = null;
        try {
            input = new FileInputStream(file);
            byte[] buffer = new byte[100];
            while (true) {
                int len = input.read(buffer);
                if (len == -1) {
                    break;
                }
                String str = new String(buffer, 0, len);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                input.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
