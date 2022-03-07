public abstract class Asignaturas {

    private Profesor profesor;
    private Estudiante estudiante;
    private Integer nota;

    public Asignaturas(Profesor profesor, Estudiante estudiante, Integer nota) {
        this.profesor = profesor;
        this.estudiante = estudiante;
        this.nota = nota;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }
}
