import java.util.ArrayList;
import java.util.List;

public class AsignarIncidencia {
    private String codigo;
    private String descripcion;
    private Incidencia incidencia;
    private Perfiles perfiles;
    public List<Incidencia> listaIncidencia = new ArrayList<Incidencia>();
    public List<Perfiles> listaPerfiles = new ArrayList<Perfiles>();
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
    public Incidencia getIncidencia() {
        return incidencia;
    }
    public void setIncidencia(Incidencia incidencia) {
        this.incidencia = incidencia;
    }
    public Perfiles getPerfiles() {
        return perfiles;
    }
    public void setPerfiles(Perfiles perfiles) {
        this.perfiles = perfiles;
    }
    
    public AsignarIncidencia(String codigo, String descripcion, Incidencia incidencia,Perfiles perfiles) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.incidencia = incidencia;
        this.perfiles = perfiles;
    }
    
}