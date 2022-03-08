public class Asignaturas {

    private String nMateria;
    private String profesor;
    private String iestudiante;
    private Float nota;

    public String getnMateria() {
        return nMateria;
    }

    public void setnMateria(String nMateria) {
        this.nMateria = nMateria;
    }

    public String getIestudiante() {
        return iestudiante;
    }

    public void setIestudiante(String iestudiante) {
        this.iestudiante = iestudiante;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }


    public float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    public void notaCorrespondiente(float nota) throws Exeption{
        if (nota > 5 || nota < 0){
            throw new Exeption("La nota esta fuera de los limites");
        }else
            this.nota = nota;
    }

    public void regisEstudiante(){

    }


}
