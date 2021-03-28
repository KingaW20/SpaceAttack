package spaceattack.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import spaceattack.game.SpaceAttack;

import java.io.*;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class Client {

    public Client() {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        new LwjglApplication(new SpaceAttack(), config);

        try (Socket client = new Socket("localhost", 8080)) {
            request(client);
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
        }
    }

    public static void request(Socket client) throws IOException, ClassNotFoundException {

    }
}
