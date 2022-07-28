package org.example.chatroom.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SocketServer extends Thread{
    private final static int port = 80;
    private final ServerSocket server;
    private final Socket socket;
    private final ExecutorService executorService = Executors.newFixedThreadPool(10);

    public SocketServer() throws IOException {
        server = new ServerSocket(port);
        System.out.println("wait client connect...");
        socket = server.accept();
        executorService.submit(new MessageWorker(socket));
    }

    public static void main(String[] args) {
        try {
            new SocketServer().start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
