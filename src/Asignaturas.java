public class Asignaturas {

    private String profesor;
    private String estudiante;
    private Float nota;


    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    public void notaCorrespondiente(Float nota) throws Exeption{
        if (nota > 5.0 || nota < 0){
            throw new Exeption("La nota esta fuera de los limites");
        }
    }

    public void regisEstudiante(){

    }


}
