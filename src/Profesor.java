public class Profesor {

    private String id;
    private String nombre;
    private String apellido;
    private String tipoContrato;

    public Profesor(String id, String nombre, String apellido, String tipoContrato) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoContrato = tipoContrato;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
}
