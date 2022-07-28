package org.example.chatroom.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketClient extends Thread {
    //定义一个Socket对象
    private Socket socket = null;

    public SocketClient(String host, int port) {
        try {
            //需要服务器的IP地址和端口号，才能获得正确的Socket对象
            socket = new Socket(host, port);
            Scanner in = new Scanner(System.in);
            while (true){
                String message = in.nextLine();
                seedMessage(message);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void seedMessage(String message){
        try {
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(message.getBytes());
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //函数入口
    public static void main(String[] args) {
        //需要服务器的正确的IP地址和端口号
        SocketClient clientTest=new SocketClient("127.0.0.1", 80);
    }
}
