package org.example.chatroom.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class MessageWorker implements Runnable{
    private final Socket socket;

    public MessageWorker(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            // OutputStream outputStream = socket.getOutputStream();
            handleMessage(inputStream);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private void handleMessage(InputStream inputStream) {
        try {
            byte[] buf = new byte[1024];
            int len = 0;
            StringBuilder sb = new StringBuilder();
            while ((len = inputStream.read(buf)) != -1) {
                sb.append(new String(buf, 0, len));
            }
            System.out.println(sb);
        } catch (IOException e) {
            System.out.println("ERROR " + e);
        }
    }
}
