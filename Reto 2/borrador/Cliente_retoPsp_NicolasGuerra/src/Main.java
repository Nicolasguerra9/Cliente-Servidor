import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        final String HOST = "localhost";
        final int PUERTO = 6000;
        DataInputStream in;
        DataOutputStream out;

        try {
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            out.writeUTF("Hola mundo desde el cliente");
            String mensage = in.readUTF();
            System.out.println(mensage);

            sc.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}