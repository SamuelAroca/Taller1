import java.util.*;

public class Universidad {

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int opcion;
        List<Estudiante> estudiante = new ArrayList<>();
        List<Estudiante> apEstudiante = new ArrayList<>();
        List<Estudiante> ideEstudiante = new ArrayList<>();
        List<Estudiante> semestreActual = new ArrayList<>();
        List<Profesor> profesor = new ArrayList<>();
        List<Profesor> apeprofesor = new ArrayList<>();
        List<Profesor> ideprofesor = new ArrayList<>();
        List<Profesor> contratoPro = new ArrayList<>();

        List<Asignaturas> asignatura = new ArrayList<>();

        do {
            System.out.println("Ingrese una opción");
            System.out.println("1. Registre Estudiante");
            System.out.println("2. Registro Profesor");
            System.out.println("3. Resgistro de Materias");
            System.out.println("0. Salir del programa");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    try {
                        System.out.println("Ingrese el ID del estudiante");
                        String id = scanner.next();
                        System.out.println("Ingrese el nombre del estudiante");
                        String nombre = scanner.next();
                        System.out.println("Ingrese apellido del estudiante");
                        String apellido = scanner.next();
                        System.out.println("Ingrese el semestre actual del estudiante");
                        Integer semestre = scanner.nextInt();

                        Estudiante est = new Estudiante();
                        Estudiante est2 = new Estudiante();
                        Estudiante est3 = new Estudiante();
                        Estudiante est4 = new Estudiante();
                        est.setId(id);
                        est2.setNombre(nombre);
                        est3.setApellido(apellido);
                        est4.setSemestreActual(semestre);

                        estudiante.add(est2);
                        apEstudiante.add(est3);
                        ideEstudiante.add(est);
                        semestreActual.add(est4);

                        System.out.println("Resumen del registro:");
                        estudiante.forEach((e) -> System.out.println("Nombre: " + e.getNombre()));
                        apEstudiante.forEach((e) -> System.out.println("Apellido: " + e.getApellido()));
                        ideEstudiante.forEach((e) -> System.out.println("Identificacion: " + e.getId()));
                        semestreActual.forEach((e) -> System.out.println("Semestre Actual: " + e.getSemestreActual()));

                    }catch (Exception e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        System.out.println("Ingrese el ID del profesor");
                        String id = scanner.next();
                        System.out.println("Ingrese el nombre del profesor");
                        String nombre = scanner.next();
                        System.out.println("Ingrese apellido del profesor");
                        String apellido = scanner.next();
                        System.out.println("Ingrese el tipo de contrato del profesor");
                        String contrato = scanner.next();

                        Profesor pro = new Profesor();
                        Profesor pro1 = new Profesor();
                        Profesor pro2 = new Profesor();
                        Profesor pro3 = new Profesor();

                        pro1.setId(id);
                        pro.setNombre(nombre);
                        pro2.setApellido(apellido);
                        pro3.setTipoContrato(contrato);

                        profesor.add(pro);
                        apeprofesor.add(pro2);
                        ideprofesor.add(pro1);
                        contratoPro.add(pro3);

                        System.out.println("Resumen del registro:");
                        profesor.forEach((p) -> System.out.println("Nombre: " + p.getNombre()));
                        apeprofesor.forEach((p) -> System.out.println("Apellido: " + p.getApellido()));
                        ideprofesor.forEach((p) -> System.out.println("Identificacion: " + p.getId()));
                        contratoPro.forEach((p) -> System.out.println("Tipo de contrato: " + p.getTipoContrato()));

                    }catch (Exception e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Registro de notas (Tenga en cuenta que el estudiante \ny el profesor tienen que estar registrados \ny ademas las notas son 4,5 no 4.5)");
                        System.out.println(" ");
                        System.out.println("Ingrese el nombre de la materia");
                        String nMateria = scanner.next();
                        System.out.println("Ingrese el ID del estudiante");
                        String idEstudiante = scanner.next();

                        for (Estudiante estudiante1 : ideEstudiante){

                            if (idEstudiante.equals(estudiante1.getId())){
                                System.out.println("Estudiante registrado");
                                System.out.println("Ingrese la identificacion del profesor");
                                String nProfesor = scanner.next();

                                for (Profesor profesor1 : ideprofesor){

                                    if (nProfesor.equals(profesor1.getId())){
                                        System.out.println("Profesor registrado");
                                        Asignaturas asig = new Asignaturas();
                                        System.out.println("Ingrese la nota del estudiante");
                                        float nota = scanner.nextFloat();
                                        asig.notaCorrespondiente(nota);
                                        asig.setnMateria(nMateria);
                                        asig.setIestudiante(idEstudiante);
                                        asig.setProfesor(nProfesor);
                                        asignatura.add(asig);

                                        asignatura.forEach((a) -> System.out.println("Materia" + a.getnMateria() + "\nNota: " + a.getNota() + "\nID: " + a.getIestudiante()));

                                    }else
                                        System.out.println("El profesor no esta registrado");
                                }
                            }else
                                System.out.println("El estudiante no esta registrado");
                        }
                    }catch (Exception e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
            }
        System.out.println(" ");
        }while (opcion != 0);
    }
}
