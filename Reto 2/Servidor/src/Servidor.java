import java.io.*;
import java.net.*;

public class Servidor {
    public static void main(String[] args) throws IOException {
        ServerSocket servidor = new ServerSocket(5000);
        System.out.println("Servidor iniciado. Esperando clientes...");

        while (true) {
            Socket cliente = servidor.accept();
            System.out.println("Cliente conectado desde " + cliente.getInetAddress().getHostAddress());

            // Flujo de entrada y salida para el cliente
            BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            PrintWriter salida = new PrintWriter(new OutputStreamWriter(cliente.getOutputStream()), true);

            // Menú
            salida.println("Bienvenido al sistema");
            salida.println("1. Iniciar Sesion");
            salida.println("2. Registrarte");
            salida.println("3. Salir");

            boolean salir = false;
            while (!salir) {
                String opcion = entrada.readLine();
                switch (opcion) {
                    case "1":
                        salida.println("Login");
                        }

                }


                // Login
                boolean loginExitoso = false;
                while (!loginExitoso) {
                    String usuario = entrada.readLine();
                    String contrasena = entrada.readLine();
                    if (usuario.equals("admin") && contrasena.equals("1234")) {
                        salida.println("Login exitoso");
                        loginExitoso = true;
                    } else {
                        salida.println("Login fallido. Intente de nuevo.");
                    }
                }



                // Cerrar conexión con el cliente
                cliente.close();
                System.out.println("Cliente desconectado.");
            }
        }

    }
