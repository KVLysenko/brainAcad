package Chat.Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class Server {

        public ArrayList<ClientThread> clientList = new ArrayList<>();

        public Server() {
        try (
                ServerSocket serverSocket = new ServerSocket(8002))
        {
            while (true) {
                Socket socket = serverSocket.accept();
                ClientThread clientThread = new ClientThread(socket, this);
                clientList.add(clientThread);
                Thread thread = new Thread(clientThread);
                thread.start();
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("404 Not Found");
    }
    public void SendMessage(String userMessange) {
        for (ClientThread clientThread : clientList) {
            clientThread.sendMessage(userMessange);
        }
    }
}