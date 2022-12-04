import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import javax.swing.*;

public class App {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        menu();
    }

    public static void menu() {
        System.out.println("****** SISTEMA DE ATENCIÓN DE SOPORTE TECTINO *****");
        System.out.println("1: Registrar Usuario");
        System.out.println("2: Mostrar Socursales");
        System.out.println("3: Registrar Empleado");
        System.out.println("4: Registrar Cliente");
        System.out.println("5: Agregar Mascota");
        System.out.println("6: Registrar Atencion");
        System.out.println("Seleccione Una Opcion");
        
        int op = Integer.parseInt(leer.nextLine());

        if (op == 1) {registrarUsuario();}
        //if (op == 2) mostrarSocursales();
        //if (op == 3) registrarEmpleados();
        //if (op == 4) registrarCliente();
        //if (op == 5) agregarMascota();
        //if (op == 6) registrarAtencion();
    
    }

    public static void registrarUsuario(){
        System.out.println("*** REGISTRAR USUARIO ***");
        String nombres = JOptionPane.showInputDialog("Ingresar nombres");
        String apellidos = JOptionPane.showInputDialog("Ingresar nombres");
        System.out.println(nombres);
        System.out.println(apellidos);
        JOptionPane.showMessageDialog(null, "Registro completo");
        menu();
    }
}
