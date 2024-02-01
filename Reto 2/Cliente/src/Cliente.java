import java.io.*;
import java.net.*;

public class Cliente {

    public static void main(String[] args) throws IOException {
        Socket cliente = new Socket("localhost", 5000);
        System.out.println("Conectado al servidor.");

        // Flujo de entrada y salida para el servidor
        BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
        PrintWriter salida = new PrintWriter(new OutputStreamWriter(cliente.getOutputStream()), true);


        // Menú
        while (true) {
            System.out.println(entrada.readLine());
            System.out.println(entrada.readLine());
            System.out.println(entrada.readLine());
            System.out.println(entrada.readLine());
            System.out.println("Ingrese una opción:");
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            String opcion = teclado.readLine();
            salida.println(opcion);
            String respuesta = entrada.readLine();
            System.out.println(respuesta);
            if (opcion.equals("3")) {
                break;
            }
        }
        
        // Login
        System.out.println("Ingrese su usuario:");
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        String usuario = teclado.readLine();
        System.out.println("Ingrese su contraseña:");
        String contrasena = teclado.readLine();
        salida.println(usuario);
        salida.println(contrasena);
        String respuesta = entrada.readLine();
        System.out.println(respuesta);
        if (!respuesta.equals("Login exitoso")) {
            System.exit(0);
        }

        // Cerrar conexión con el servidor
        cliente.close();
        System.out.println("Desconectado del servidor.");
    }

}
