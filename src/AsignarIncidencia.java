import java.util.ArrayList;
import java.util.List;

public class AsignarIncidencia {
    private String codigo;
    private String descripcion;
    private List<Incidencia> listaIncidencia = new ArrayList<Incidencia>();
    private List<Perfiles> listaPerfiles = new ArrayList<Perfiles>();
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public List<Incidencia> getListaIncidencia() {
        return listaIncidencia;
    }
    public void setListaIncidencia(List<Incidencia> listaIncidencia) {
        this.listaIncidencia = listaIncidencia;
    }
    public List<Perfiles> getListaPerfiles() {
        return listaPerfiles;
    }
    public void setListaPerfiles(List<Perfiles> listaPerfiles) {
        this.listaPerfiles = listaPerfiles;
    }
    public AsignarIncidencia(String codigo, String descripcion, List<Incidencia> listaIncidencia,
            List<Perfiles> listaPerfiles) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.listaIncidencia = listaIncidencia;
        this.listaPerfiles = listaPerfiles;
    }
    
}
