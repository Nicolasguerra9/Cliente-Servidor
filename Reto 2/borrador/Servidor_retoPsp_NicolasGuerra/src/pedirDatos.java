import java.util.Scanner;

public class pedirDatos {
    static Scanner sc = new Scanner(System.in);




    //--------------------------------------- Menu Principal ---------------------------------------------------------
    static int menuGRegistro() {
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("MENU DE REGISTROS");
        System.out.println("1.Registre");
        System.out.println("2.Accedir");
        System.out.println("0.Soritr");
        System.out.println("---------------------------------");
        int opcion = sc.nextInt();
        System.out.println("Has elegido la opcion: " + opcion);

        return opcion;
    }
}
