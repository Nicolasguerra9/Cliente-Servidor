import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;
        DataOutputStream out;
        final int PUERTO = 6000;

        try{
            servidor = new ServerSocket(PUERTO);
            System.out.println("Servidor Iniciado");
            System.out.println("Esperando cliente.......");

            while (true){


                sc = servidor.accept();

                System.out.println("Cliente conectado");
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());


                String mensaje = in.readUTF();
                System.out.println(mensaje);
                out.writeUTF("Hola mundo desde el servidor");

                sc.close();
                System.out.println("Cliente desconectado");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}