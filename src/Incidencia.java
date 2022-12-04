
public class Incidencia {
    private String proyecto;
    private String estado;
    private String criticidad;
    private String aplicacionesAfectadas;
    private String fecha_registro;
    private String fecha_repertura;
    private String descripcion_corta;
    private String descripcion;
    public String getProyecto() {
        return proyecto;
    }
    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCriticidad() {
        return criticidad;
    }
    public void setCriticidad(String criticidad) {
        this.criticidad = criticidad;
    }
    public String getAplicacionesAfectadas() {
        return aplicacionesAfectadas;
    }
    public void setAplicacionesAfectadas(String aplicacionesAfectadas) {
        this.aplicacionesAfectadas = aplicacionesAfectadas;
    }
    public String getFecha_registro() {
        return fecha_registro;
    }
    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
    public String getFecha_repertura() {
        return fecha_repertura;
    }
    public void setFecha_repertura(String fecha_repertura) {
        this.fecha_repertura = fecha_repertura;
    }
    public String getDescripcion_corta() {
        return descripcion_corta;
    }
    public void setDescripcion_corta(String descripcion_corta) {
        this.descripcion_corta = descripcion_corta;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Incidencia(String proyecto, String estado, String criticidad, String aplicacionesAfectadas,
            String fecha_registro, String fecha_repertura, String descripcion_corta, String descripcion) {
        this.proyecto = proyecto;
        this.estado = estado;
        this.criticidad = criticidad;
        this.aplicacionesAfectadas = aplicacionesAfectadas;
        this.fecha_registro = fecha_registro;
        this.fecha_repertura = fecha_repertura;
        this.descripcion_corta = descripcion_corta;
        this.descripcion = descripcion;
    }
    

}
