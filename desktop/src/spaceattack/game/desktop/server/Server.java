package spaceattack.game.desktop.server;

import java.util.Date;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.text.SimpleDateFormat;


public class Server {
    private static int port = 8080;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Server started at "+ new Date()+ " on standard TCP/IP protocol on port " + port+".");
        ExecutorService threadPoll = Executors.newFixedThreadPool(2);
        try (ServerSocket server = new ServerSocket(port)) {
            while (System.in.available() == 0 || !(scan.nextLine().equals("exit"))) {
                /*try {
                    Socket socket = server.accept();
                    threadPoll.submit(() -> {
                        try {
                            runProtocol(socket);
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    });
                } catch (IOException e) {
                    System.exit(1);
                }*/
            }
            threadPoll.shutdownNow();
        } catch (IOException ex) {
            System.exit(1);
        }
    }

    public static void runProtocol(Socket client) throws IOException, ClassNotFoundException {

    }
}
