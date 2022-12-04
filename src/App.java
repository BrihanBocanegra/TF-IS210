import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {

    static List<Perfiles> listaperfiles = new ArrayList<Perfiles>();
    static List<TipoIncidencia> listaTipoIncidencia = new ArrayList<TipoIncidencia>();
    static List<Incidencia> listaIncidencia = new ArrayList<Incidencia>();
    static List<AtencionIncidencias> listaAtencioneIncidencias = new ArrayList<AtencionIncidencias>();

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        menu();
    }


    public static void menu() {
        System.out.println("****** SISTEMA DE ATENCIÓN DE SOPORTE TECTINO *****");
        System.out.println("1: Registrar Perfil");
        System.out.println("2: Listar Perfiles");

        System.out.println("3: Registrar Tipo Incidencia");
        System.out.println("4: Listar Tipo Incidencia");

        System.out.println("5: Crear Incidencia");
        System.out.println("5: Listar Incidencias");

        System.out.println("7: Registrar Atencion");
        System.out.println("Seleccione Una Opcion");
        int op = Integer.parseInt(leer.nextLine());
        String valor = "";
        // if (op!=valor.length()) {
            
        // }

        if (op == 1) registrarPerfil();
        if (op == 2) listarPerfiles();
        if (op == 3) registrarTipoIncidencia();
        if (op == 4) listarTipoIncidencia();
        // if (op == 5) agregarMascota();
        // if (op == 6) registrarAtencion();
        
    }






    public static void registrarPerfil() {
        System.out.println("\n");
        System.out.println("****** REGISTRAR PERFILES *****");
        System.out.println("Ingrese Codigo del Usuario: ");
        String codigo = leer.nextLine();
        System.out.println("Ingrese Nombres: ");
        String nombres = leer.nextLine();
        System.out.println("Ingrese Apellidos: ");
        String apellidos = leer.nextLine();
        System.out.println("Ingrese Cargo: ");
        String cargo = leer.nextLine();
        
        listaperfiles.add(new Perfiles(codigo, nombres,apellidos, cargo));
        System.out.println("\nRegistro el perfil");
        menu();
    }

    public static void listarPerfiles() {
        System.out.println("\n");
        System.out.println("****** MOSTRAR PERFILES *****");
        int contador = 0;
        for (Perfiles perfiles : listaperfiles) {
            System.out.println((contador++) + " - " + perfiles.getCodigo() + " " + perfiles.getNombres() + " " + perfiles.getApellidos() + " " + perfiles.getCargo());
        }
        System.out.println("\n");
        menu();
    }


    // CREAR TIPOS INCIDENCIA

    public static void registrarTipoIncidencia() {
        System.out.println("\n");
        System.out.println("****** REGISTRAR TIPO INCIDENCIA *****");
        System.out.println("Ingrese Codigo: ");
        String codigo = leer.nextLine();
        System.out.println("Ingrese Descripcion: ");
        String descripcion = leer.nextLine();
        
        
        listaTipoIncidencia.add(new TipoIncidencia(codigo, descripcion));
        System.out.println("\nRegistro el perfil");
        menu();
    }

    public static void listarTipoIncidencia() {
        System.out.println("\n");
        System.out.println("****** MOSTRAR TIPO INCIDENCIA *****");
        int contador = 0;
        for (TipoIncidencia tipoIncidencia : listaTipoIncidencia) {
            System.out.println((contador++) + " - " + tipoIncidencia.getCodigo() + " " + tipoIncidencia.getDescripcion());
        }
        System.out.println("\n");
        menu();
    }


}
