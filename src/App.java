import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import javax.swing.*;

public class App {

    static List<Perfiles> listaPerfiles = new ArrayList<Perfiles>();
    static List<TipoIncidencia> listaTipoIncidencia = new ArrayList<TipoIncidencia>();
    static List<Incidencia> listaIncidencia = new ArrayList<Incidencia>();
    static List<AtencionIncidencias> listaAtencioneIncidencias = new ArrayList<AtencionIncidencias>();

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        menu();
    }

    public static void menu() {
        System.out.println("***** SISTEMA DE ATENCIÓN DE SOPORTE TECTINO *****");
    
        JDialog.setDefaultLookAndFeelDecorated(true);
        Object[] selectionValues = { 
            "1: Registrar Perfil", 
            "2: Listar Perfiles", 
            "3: Registrar Tipo Incidencia",
            "4: Listar Tipo Incidencia",
            "5: Crear Incidencia",
            "6: Listar Incidencias",
            "7: Registrar Atencion"
        };

        String initialSelection = "";
        Object selection = JOptionPane.showInputDialog(
            null, 
            "Selecione una opción:",
            "SISTEMA DE ATENCIÓN",
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            selectionValues, 
            initialSelection
            );
        
        String op = (String) selection;
        switch (op) {
            case "1: Registrar Perfil":
                registrarUsuario();
                break;
            case "2: Listar Perfiles":
                listarPerfiles();
                break;
            case "3: Registrar Tipo Incidencia":
                registrarTipoIncidencia();
                break;
            case "4: Listar Tipo Incidencia":
                listarTipoIncidencia();
                break;
            case "5: Crear Incidencia":
                registrarUsuario();
                break;
            case "6: Listar Incidencias":
                listarPerfiles();
                break;
            case "7: Registrar Atencion":
                listarPerfiles();
                break;
            default:
            System.out.println("******");
        }
    }

    // REGISTRAR PERFILES
    public static void registrarUsuario(){       
        String title = "REGISTRAR PERFIL";
        int dialog = 3;

        String codigo = "A" + (int) (Math.random() * 50 + 1);
        String nombres = JOptionPane.showInputDialog(null, "Ingresar nombres", title, dialog);
        String apellidos = JOptionPane.showInputDialog(null,"Ingresar apellidos", title, dialog);

        Object[] selectionValues = { 
            "Administrador",
            "Operario", 
            "Invitado"
        };
        Object cargo = JOptionPane.showInputDialog(
            null,
            "Seleccione su cargo",
            title,
            dialog, 
            null,
            selectionValues,
            "Administrador"
            );
        
        // RESUMEN
        String lineSep = System.lineSeparator();
        StringBuilder result = new StringBuilder();
        result.append("Registro completo").append(lineSep).append(lineSep);
        result.append("Código: ").append(codigo).append(lineSep);
        result.append("Nombres: ").append(nombres).append(lineSep);
        result.append("Apellidos: ").append(apellidos).append(lineSep);
        result.append("Cargo: ").append(cargo).append(lineSep);
          
        listaPerfiles.add(new Perfiles(codigo, nombres, apellidos, (String) cargo));
        JOptionPane.showMessageDialog(null, result.toString(), title, dialog = 1);

        menu();
    }

    // LISTAR PERFILES
    public static void listarPerfiles() {
        System.out.println("\n");
        System.out.println("****** MOSTRAR PERFILES *****");
        int contador = 0;
        for (Perfiles item : listaPerfiles) {
            System.out.println((++contador) + " - " + item.getCodigo() + " " + item.getNombres() + " " + item.getApellidos() + " " + item.getCargo());
        }
        System.out.println("\n");
        menu();
    }

    // CREAR TIPO DE INCIDENCIA
    public static void registrarTipoIncidencia() {
        String title = "REGISTRAR TIPO DE INCIDENCIA";
        int dialog = 3;        
        
        Object[] selectionValues = { 
            "Severidad A", 
            "Severidad B", 
            "Severidad C"  
        };
        
        Object codigo = JOptionPane.showInputDialog(
            null,
            "Seleccione una opcion",
            title,
            dialog,
            null,           
            selectionValues,
            "Severidad A"
            );
        
        String descripcion = JOptionPane.showInputDialog(null, "Ingresar nombres", title, dialog);
        
        // RESUMEN
        String lineSep = System.lineSeparator();
        StringBuilder result = new StringBuilder();
        result.append("Registro completo").append(lineSep).append(lineSep);
        result.append("Código: ").append(codigo).append(lineSep);
        result.append("Descripción: ").append(descripcion).append(lineSep);
        
        listaTipoIncidencia.add(new TipoIncidencia((String) codigo, descripcion));
        JOptionPane.showMessageDialog(null, result.toString(), title, dialog = 1);
        
        menu();
    }

    // LISTAR TIPO DE INCIDENCIA
    public static void listarTipoIncidencia() {
        System.out.println("\n");
        System.out.println("****** MOSTRAR TIPO INCIDENCIA *****");
        int contador = 0;
        for (TipoIncidencia item : listaTipoIncidencia) {
            System.out.println((++contador) + ".- || Severidad: " + item.getCodigo() + " || Descripción: " + item.getDescripcion());
        }
        System.out.println("\n");
        menu();
    }

}
