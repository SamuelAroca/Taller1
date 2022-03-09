import java.util.List;

public class Estudiante {

    private Integer id;
    private String nombre;
    private String apellido;
    private Integer semestreActual;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getSemestreActual() {
        return semestreActual;
    }

    public void setSemestreActual(Integer semestreActual) {
        this.semestreActual = semestreActual;
    }

    public void rangoSemestre(int semestre) throws Exeption{
        if (semestre < 1 || semestre > 10){
            throw new Exeption("El semestre esta fuera del rango");
        }else
            this.semestreActual = semestre;
    }

    public void posicionAlumno(int n, List<Estudiante> estudiante) throws Exeption{

    }
}
