package Chat.Client;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userLogin = "kirill";

        try (   Socket socket = new Socket("127.0.0.1", 8002);
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())))
        {
            ServerThread serverThread = new ServerThread(socket);
            new Thread(serverThread).start();
            bufferedWriter.write("Пользователь " + userLogin + " подключился к чату:\n");
            bufferedWriter.flush();
            while (true) {
                String userMessage = scanner.nextLine();
                bufferedWriter.write(userLogin + ":" + userMessage + "\n");
                bufferedWriter.flush();
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}