package Chat.Client;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;

    public ServerThread(Socket socket) {
        try {
            this.socket = socket;
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        String message = null;
        try {
            while (true) {

                message = this.bufferedReader.readLine();
                System.out.println(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("404 Not Found");
        }
    }
}
