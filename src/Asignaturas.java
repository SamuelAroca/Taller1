public class Asignaturas {

    private String nMateria;
    private Integer profesor;
    private Integer iestudiante;
    private Float nota;

    public String getnMateria() {
        return nMateria;
    }

    public void setnMateria(String nMateria) {
        this.nMateria = nMateria;
    }

    public Integer getIestudiante() {
        return iestudiante;
    }

    public void setIestudiante(Integer iestudiante) {
        this.iestudiante = iestudiante;
    }

    public Integer getProfesor() {
        return profesor;
    }

    public void setProfesor(Integer profesor) {
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
}