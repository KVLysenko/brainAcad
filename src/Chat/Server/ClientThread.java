package Chat.Server;

import java.io.*;
import java.net.Socket;

public class ClientThread implements Runnable {
    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private Server server;
    String userMessage;

    public ClientThread(Socket socket, Server server) {
        this.socket = socket;
        try {
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.server = server;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        try {
            while (true) {
                userMessage = this.bufferedReader.readLine();
                System.out.println(userMessage);
                this.server.SendMessage(userMessage + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void sendMessage(String message){
        try {
            bufferedWriter.write(message);
            bufferedWriter.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}